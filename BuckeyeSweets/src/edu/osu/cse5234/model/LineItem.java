package edu.osu.cse5234.model;

import java.io.Serializable;

import edu.osu.cse5234.business.view.Item;

public class LineItem implements Serializable {

	/**
	 */
	private static final long serialVersionUID = 6836946300494613018L;
	private String name;
	private Double price;
	private Integer quantity;

	/**
	 * 
	 */
	public LineItem() {
	}

	public LineItem(Item item) {
		name = item.getName();
		price = item.getPrice();
		quantity = 0;
	}

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public LineItem(String name, Double price, Integer quantity) {
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
