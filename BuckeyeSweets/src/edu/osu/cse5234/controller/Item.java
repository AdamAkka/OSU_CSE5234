package edu.osu.cse5234.controller;

import java.io.Serializable;

public class Item implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -238066108300505539L;
	
	private String name;
	private Double price;
	private Integer quantity;
	/**
	 * 
	 */
	
	public Item() {
	}
	
	/**
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Item(String name, Double price, Integer quantity) {
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
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
