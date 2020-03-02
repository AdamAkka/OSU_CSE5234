package edu.osu.cse5234.business.view;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface InventoryService {
	// check if item is available.
	public Inventory getAvailableInventory();

	public boolean validateQuantity(List<LineItem> list);

	public boolean updateInventory(List<LineItem> items);

}
