package edu.osu.cse5234.business.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 

@Entity
@Table(name = "ITEM")

public class Item implements Serializable {

	private static final long serialVersionUID = -238066108300505539L;

	private Integer id;
	private Integer itemNumber;
	private String name;
	private String description;
//	private Integer quantity;
	private Integer availableQuantity;
	private Double unitPrice;

	public Item() {
	}

	public Item(Integer id, Integer itemNumber, String name, String description, Integer availableQuantity, Double unitPrice) {
		this.id = id;
		this.itemNumber = itemNumber;
		this.name = name;
		this.description = description;
//		this.quantity = quantity;
		this.availableQuantity = availableQuantity;
		this.unitPrice = unitPrice;
	}

/*	public Item(Item item) {
		name = item.getName();
		unitPrice = item.getUnitPrice();
		quantity = 0;
	}*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ITEM_NUMBER")
	public Integer getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "AVAILABLE_QUANTITY")
	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	
//	@Column(name = "AVAILABLE_QUANTITY")
//	@Transient
//	public Integer getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(Integer quantity) {
//		this.quantity = quantity;
//	}


	@Column(name = "UNIT_PRICE")
	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
