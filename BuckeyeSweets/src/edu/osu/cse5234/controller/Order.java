package edu.osu.cse5234.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import edu.osu.cse5234.business.view.Item;

public class Order implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 696089912823266788L;

	private List<Item> items;

	/**
	* 
	*/
	public Order() {
		items = new ArrayList<Item>();
	}

	/**
	 * @param items
	 */
	public Order(List<Item> items) {
		this.items = items;
	}

	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

}