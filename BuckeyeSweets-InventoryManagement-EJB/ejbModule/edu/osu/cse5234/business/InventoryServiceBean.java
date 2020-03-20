package edu.osu.cse5234.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;


/**
 * Session Bean implementation class InventoryBean
 */
@Stateless
@Remote(InventoryService.class)
public class InventoryServiceBean implements InventoryService {

	@PersistenceContext
	private EntityManager entityManager;
	private String MY_QUERY = "Select i from Item i";
	
	/**
	 * Default constructor.
	 */
	public InventoryServiceBean() {
	}

	@Override
	public Inventory getAvailableInventory() {

		List<Item> itemList = new ArrayList<Item>();
		itemList = entityManager.createQuery(MY_QUERY, Item.class).getResultList();

		return new Inventory(itemList);
	}

	@Override
	public boolean validateQuantity(List<Item> lineItems) {

/*		for (Item orderItem : lineItems) {
			if (orderItem.getQuantity() > 0) {
				
				for (Item inventoryItem : itemList) {
					if (orderItem.getName().equals(inventoryItem.getName())) {
						if (orderItem.getAvailableQuantity() > inventoryItem.getAvailableQuantity()) {
							return false;
						}
					}
				}
			}
		}*/

		return true;
	}

	@Override
	public boolean updateInventory(List<Item> items) {
		// TODO Auto-generated method stub
		return true;
	}
}