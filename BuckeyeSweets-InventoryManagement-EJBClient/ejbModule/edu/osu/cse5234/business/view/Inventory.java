package edu.osu.cse5234.business.view;

import java.io.Serializable;
import java.util.List;

public class Inventory implements Serializable {

	/**
	 */
	private static final long serialVersionUID = 1L;

	private List<Item> itemList;

	/**
	 * 
	 */
	public Inventory() {
	}

	/**
	 * @param itemList
	 */
	public Inventory(List<Item> itemList) {
		this.itemList = itemList;
	}

	/**
	 * @return the itemList
	 */
	public List<Item> getItemList() {
		return itemList;
	}

	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

}
