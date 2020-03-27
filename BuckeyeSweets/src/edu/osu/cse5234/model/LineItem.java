package edu.osu.cse5234.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import edu.osu.cse5234.business.view.Item;

@Entity
@Table(name = "CUSTOMER_ORDER_LINE_ITEM")

public class LineItem implements Serializable {

	/**
	 */
	private static final long serialVersionUID = 6836946300494613018L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "ITEM_NUMBER")
	private int itemNumber;

	@Column(name = "ITEM_NAME")
	private String itemName;

	@Column(name = "QUANTITY")
	private Integer quantityRequested;

	@Transient
	private Double price;

	@Transient
	private String description;

	@Transient
	private Integer availableQuantity;

	public LineItem() {
	}

	public LineItem(Item item) {
		id = item.getId();
		itemNumber = item.getItemNumber();
		itemName = item.getName();
		price = item.getUnitPrice();
		quantityRequested = 0;
		description = item.getDescription();
		availableQuantity = item.getAvailableQuantity();
	}

	public LineItem(int id, int itemNumber, String itemName, Double price, Integer quantityRequested) {
		this.id = id;
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.price = price;
		this.quantityRequested = quantityRequested;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String name) {
		this.itemName = name;
	}

	public Integer getQuantityRequested() {
		return quantityRequested;
	}

	public void setQuantityRequested(Integer quantityRequested) {
		this.quantityRequested = quantityRequested;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

}
