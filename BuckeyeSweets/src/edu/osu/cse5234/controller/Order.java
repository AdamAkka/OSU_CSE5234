package edu.osu.cse5234.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import edu.osu.cse5234.business.view.LineItem;

public class Order implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 696089912823266788L;

	private List<LineItem> items;

	/**
	* 
	*/
	public Order() {
		items = new ArrayList<LineItem>();
	}

	/**
	 * @param items
	 */
	public Order(List<LineItem> items) {
		this.items = items;
	}

	/**
	 * @return the items
	 */
	public List<LineItem> getItems() {
		return items;
	}

	/**
	 * @param myItemList the items to set
	 */
	public void setItems(List<LineItem> myItemList) {
		this.items = myItemList;
	}

}