package edu.osu.cse5234.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.osu.cse5234.business.OrderProcessingServiceBean;
import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;
import edu.osu.cse5234.util.ServiceLocator;

@Controller
@RequestMapping("/purchase")
public class Purchase {

	@RequestMapping(method = RequestMethod.GET)
	public String viewOrderEntryForm(HttpServletRequest request, HttpServletResponse response) throws Exception {

		InventoryService inventoryService = ServiceLocator.getInventoryService();
		Inventory inventory = inventoryService.getAvailableInventory();
		List<Item> itemList = inventory.getItemList();

// Change <Item> to <LineItem> (for lab 8, class is already created).	
		List<Item> myItemList = new ArrayList<Item>();

		for (Item item : itemList) {
			Item oneItem = new Item(item);
			myItemList.add(oneItem);
		}

		Order order = (Order) request.getSession().getAttribute("order");

		order.setItems(myItemList);
		request.getSession().setAttribute("order", order);

// 		... instantiate and set order object with items to display

//		List<Item> items = new ArrayList<Item>();

//		items.add(new Item("Brownie", 3.49, 0));
//		items.add(new Item("Cookie", 1.99, 0));
//		items.add(new Item("Eclair", 4.99, 0));
//		items.add(new Item("Cupcake", 2.49, 0));
//		items.add(new Item("Buckeye", 1.49, 0));

//		Order order = new Order(items);
//		request.setAttribute("order", order);

		return "OrderEntryForm";
	}

	@RequestMapping(path = "/submitItems", method = RequestMethod.POST)
	public String submitItems(@ModelAttribute("order") Order order, HttpServletRequest request) {
		request.getSession().setAttribute("order", order);

		OrderProcessingServiceBean orderProcessingServiceBean = ServiceLocator.getOrderProcessingService();

		if (orderProcessingServiceBean.validateItemAvailability(order)) {

			request.getSession().setAttribute("valid", true);
			return "redirect:/purchase/paymentEntry";

		} else {

			request.getSession().setAttribute("valid", false);
			return "redirect:/";
		}

	}

	@RequestMapping(path = "/paymentEntry", method = RequestMethod.GET)
	public String viewPaymentEntryForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("paymentInfo", new PaymentInfo());

		return "PaymentEntryForm";
	}

	@RequestMapping(path = "/submitPayment", method = RequestMethod.POST)
	public String submitPayment(@ModelAttribute("paymentInfo") PaymentInfo paymentInfo, HttpServletRequest request)
			throws Exception {
		request.getSession().setAttribute("paymentInfo", paymentInfo);
		return "redirect:/purchase/shippingEntry";
	}

	@RequestMapping(path = "/shippingEntry", method = RequestMethod.GET)
	public String viewShippingEntryForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("shippingInfo", new ShippingInfo());
		return "ShippingEntryForm";
	}

	@RequestMapping(path = "/submitShipping", method = RequestMethod.POST)
	public String submitShipping(@ModelAttribute("shippingInfo") ShippingInfo shippingInfo, HttpServletRequest request)
			throws Exception {
		request.getSession().setAttribute("shippingInfo", shippingInfo);
		return "redirect:/purchase/viewOrder";
	}

	@RequestMapping(path = "/viewOrder", method = RequestMethod.GET)
	public String viewOrderForm(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "ViewOrder";
	}

	@RequestMapping(path = "/confirmOrder", method = RequestMethod.POST)
	public String confirmOrder(@ModelAttribute("order") Order order, HttpServletRequest request) throws Exception {

		OrderProcessingServiceBean orderProcessingServiceBean = ServiceLocator.getOrderProcessingService();

		String confirmationCode = orderProcessingServiceBean.processOrder(order);

		request.getSession().setAttribute("confirmationCode", confirmationCode);

		return "redirect:/purchase/viewConfirmation";
	}

	@RequestMapping(path = "/viewConfirmation", method = RequestMethod.GET)
	public String viewConfirmationForm(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "Confirmation";
	}
}