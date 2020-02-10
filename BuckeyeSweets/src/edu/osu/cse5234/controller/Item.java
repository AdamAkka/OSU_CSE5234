package edu.osu.cse5234.controller;

import java.io.Serializable;

public class Item implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -238066108300505539L;
	
	private String name;
	private String price;
	private String quantity;
	/**
	 * 
	 */
	
	//public Item() {
	//}
	
	/**
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Item(String name, String price, String quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
}
