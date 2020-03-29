package edu.osu.cse5234.business;

import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.ConnectionFactory;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.model.Order;
import edu.osu.cse5234.util.Converter;
import edu.osu.cse5234.util.ServiceLocator;

@Resource(name="jms/emailQCF", lookup="jms/emailQCF", type=ConnectionFactory.class) 

/**
 * Session Bean implementation class OrderProcessingServiceBean
 */
@Stateless
@LocalBean
public class OrderProcessingServiceBean {
	
	@Inject
	@JMSConnectionFactory("java:comp/env/jms/emailQCF")
	private JMSContext jmsContext;

	@Resource(lookup="jms/emailQ")
	private Queue queue;


	@PersistenceContext
	private EntityManager entityManager;

	public OrderProcessingServiceBean() {
		// TODO Auto-generated constructor stub
	}
	
	private void notifyUser() {

		String customerEmail = "adamemail@gmx.com";
		String message = customerEmail + ":" +
		       "Your order was successfully submitted. " +
		     	"You will hear from us when items are shipped. " +
		      	new Date();

		System.out.println("Sending message: " + message);
		jmsContext.createProducer().send(queue, message);
		System.out.println("Message Sent!");
		}


	public String processOrder(Order order) {

		entityManager.persist(order);
		entityManager.flush();

		int maximum = 99999999;
		int minimum = 10000000;
		Random random = new Random();
		int myRandomNumber = random.nextInt(maximum - minimum + 1) + minimum;
		return String.valueOf(myRandomNumber);

	}

	public boolean validateItemAvailability(Order order) {

		InventoryService inventoryService = ServiceLocator.getInventoryService();
		return inventoryService.validateQuantity(Converter.convertLineItemToItem(order.getMyItemList()));
	}
}
