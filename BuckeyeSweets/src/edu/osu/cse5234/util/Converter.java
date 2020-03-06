package edu.osu.cse5234.util;

import java.util.ArrayList;
import java.util.List;

import edu.osu.cse5234.business.view.Item;
import edu.osu.cse5234.model.LineItem;

public class Converter {

	public static List<LineItem> convert(List<Item> items) {

		List<LineItem> lineItems = new ArrayList<LineItem>();
		for (Item item : items) {
			LineItem lineItem = new LineItem();
			lineItem.setName(item.getName());
			lineItem.setPrice(item.getPrice());
			lineItem.setQuantity(item.getQuantity());
			lineItems.add(lineItem);

		}
		return lineItems;
	}

	public static List<Item> converting(List<LineItem> lineItems) {

		List<Item> myItems = new ArrayList<Item>();
		for (LineItem lineItem : lineItems) {
			Item newItem = new Item();
			newItem.setName(lineItem.getName());
			newItem.setPrice(lineItem.getPrice());
			newItem.setQuantity(lineItem.getQuantity());
			myItems.add(newItem);
		}

		return myItems;
	}
}
