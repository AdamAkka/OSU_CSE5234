package edu.osu.cse5234.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT_INFO")

public class PaymentInfo implements Serializable {
	
	private static final long serialVersionUID = 1828854161233751193L;
	
	private int id;
	private String cardNumber;
	private String expirationDate;
	private String ccvCode;
	private String cardHolderName;
	
	public PaymentInfo() {
	}

	public PaymentInfo(int id, String cardNumber, String expirationDate, String ccvCode, String cardHolderName) {
		this.id = id;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.ccvCode = ccvCode;
		this.cardHolderName = cardHolderName;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "HOLDER_NAME")
	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	
	@Column(name = "CARD_NUM")
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Column(name = "EXP_DATE")
	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Column(name = "CVV")
	public String getCcvCode() {
		return ccvCode;
	}

	public void setCcvCode(String ccvCode) {
		this.ccvCode = ccvCode;
	}


}
