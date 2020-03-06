package edu.osu.cse5234.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 696089912823266788L;

	private List<LineItem> myItemList;

	/**
	* 
	*/
	public Order() {
		myItemList = new ArrayList<LineItem>();
	}

	/**
	 * @param items
	 */
	public Order(List<LineItem> items) {
		this.myItemList = items;
	}

	/**
	 * @return the items
	 */
	public List<LineItem> getMyItemList() {
		return myItemList;
	}

	/**
	 * @param list the items to set
	 */
	public void setMyItemList(List<LineItem> list) {
		this.myItemList = list;
	}

}