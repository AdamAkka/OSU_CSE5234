package edu.osu.cse5234.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;

/**
 * Session Bean implementation class InventoryServiceBean
 */
@Stateless
public class InventoryServiceBean implements InventoryService {

	/**
	 * Default constructor.
	 */
	public InventoryServiceBean() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public Inventory getAvailableInventory() {
		// TODO Auto-generated method stub

		List<Item> items = new ArrayList<Item>();

		items.add(new Item("Brownie", 3.49, 0));
		items.add(new Item("Cookie", 1.99, 0));
		items.add(new Item("Eclair", 4.99, 0));
		items.add(new Item("Cupcake", 2.49, 0));
		items.add(new Item("Buckeye", 1.49, 0));
		items.add(new Item("Cake", 15.99, 0));

		return (Inventory) items;
	}

	@Override
	public boolean validateQuantity(List<Item> items) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateInventory(List<Item> items) {
		// TODO Auto-generated method stub
		return true;
	}
}
