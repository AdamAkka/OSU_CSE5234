package edu.osu.cse5234.business;

import java.util.Random;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.model.Order;
import edu.osu.cse5234.util.Converter;
import edu.osu.cse5234.util.ServiceLocator;

/**
 * Session Bean implementation class OrderProcessingServiceBean
 */
@Stateless
@LocalBean
public class OrderProcessingServiceBean {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public OrderProcessingServiceBean() {
		// TODO Auto-generated constructor stub
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
