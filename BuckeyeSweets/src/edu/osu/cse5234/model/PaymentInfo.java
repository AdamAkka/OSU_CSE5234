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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "HOLDER_NAME")
	private String cardHolderName;

	@Column(name = "CARD_NUM")
	private String cardNumber;

	@Column(name = "EXP_DATE")
	private String expirationDate;

	@Column(name = "CVV")
	private String ccvCode;

	public PaymentInfo() {
	}

	public PaymentInfo(int id, String cardNumber, String expirationDate, String ccvCode, String cardHolderName) {
		this.id = id;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.ccvCode = ccvCode;
		this.cardHolderName = cardHolderName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCcvCode() {
		return ccvCode;
	}

	public void setCcvCode(String ccvCode) {
		this.ccvCode = ccvCode;
	}

}
