package edu.osu.cse5234.controller;

import java.io.Serializable;
import java.util.*;

public class Order implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 696089912823266788L;
	
	private ArrayList<String> items = new ArrayList<String>();

	/**
	 * 
	 */
	public Order() {
	}

	/**
	 * @param items
	 */
	public Order(ArrayList<String> items) {
		this.items = items;
	}

	/**
	 * @return the items
	 */
	public ArrayList<String> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	
}
