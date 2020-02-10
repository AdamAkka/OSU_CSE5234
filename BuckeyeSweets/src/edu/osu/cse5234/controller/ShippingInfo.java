package edu.osu.cse5234.controller;

import java.io.Serializable;

public class ShippingInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6043095112751714490L;
	
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
		
	/**
	 * No parameter constructor
	 */
	public ShippingInfo() {
	}
	

	/**
	 * Overloaded constructor
	 * @param name
	 * @param addressLine1
	 * @param addressLine2
	 * @param city
	 * @param state
	 * @param zip
	 */
	public ShippingInfo(String name, String addressLine1, String addressLine2, String city, String state, String zip) {
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	// Getters and Setters have been created here
	
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
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}


	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}


	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
