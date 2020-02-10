package edu.osu.cse5234.controller;

import java.io.Serializable;
//import java.util.*;

public class PaymentInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1828854161233751193L;
	
	private String cardNumber;
	private String expirationDate;
	private String ccvCode;
	private String cardHolderName;
	
	/**
	 * 
	 */
	public PaymentInfo() {
	}

	/**
	 * @param cardNumber
	 * @param expirationDate
	 * @param ccvCode
	 * @param cardHolderName
	 */
	public PaymentInfo(String cardNumber, String expirationDate, String ccvCode, String cardHolderName) {
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.ccvCode = ccvCode;
		this.cardHolderName = cardHolderName;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the ccvCode
	 */
	public String getCcvCode() {
		return ccvCode;
	}

	/**
	 * @param ccvCode the ccvCode to set
	 */
	public void setCcvCode(String ccvCode) {
		this.ccvCode = ccvCode;
	}

	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

}
