package edu.osu.cse5234.util;

import java.util.ArrayList;
import java.util.List;

import edu.osu.cse5234.business.view.Item;
import edu.osu.cse5234.model.LineItem;

public class Converter {

	public static List<LineItem> convertItemToLineItem(List<Item> items) {

		List<LineItem> lineItems = new ArrayList<LineItem>();
		for (Item item : items) {
			LineItem lineItem = new LineItem(item);
			lineItems.add(lineItem);
		}
		return lineItems;
	}

	public static List<Item> convertLineItemToItem(List<LineItem> lineItems) {

		List<Item> myItems = new ArrayList<Item>();
		for (LineItem lineItem : lineItems) {

			Item newItem = new Item();

			newItem.setItemNumber(lineItem.getItemNumber());
			newItem.setName(lineItem.getItemName());
			newItem.setUnitPrice(lineItem.getPrice());
			newItem.setAvailableQuantity(lineItem.getQuantityRequested());
			newItem.setDescription(lineItem.getDescription());

			myItems.add(newItem);
		}

		return myItems;
	}
}
