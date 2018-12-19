package com.example.payOrders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payorder")
public class PayOrder implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long poNumber;
	
	@Column(name = "poAmount")
	private int poAmount;
	
	@Column(name = "poCommission")
	private int poCommission;
	
	@Column(name = "applicantName")
	private String applicantName;
	
	@Column(name = "applicantAddress")
	private String applicantAddress;
	
	@Column(name = "favoringName")
	private String favoringName;
	
	@Column(name = "favoringAddress")
	private String favoringAddress;

	public PayOrder() {
		
	}
	
	public PayOrder(long poNumber, int poAmount, int poCommission, String applicantName, String applicantAddress,
			String favoringName, String favoringAddress) {
		super();
		this.poNumber = poNumber;
		this.poAmount = poAmount;
		this.poCommission = poCommission;
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
		this.favoringName = favoringName;
		this.favoringAddress = favoringAddress;
	}

	public long getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(long poNumber) {
		this.poNumber = poNumber;
	}

	public int getPoAmount() {
		return poAmount;
	}

	public void setPoAmount(int poAmount) {
		this.poAmount = poAmount;
	}

	public int getPoCommission() {
		return poCommission;
	}

	public void setPoCommission(int poCommission) {
		this.poCommission = poCommission;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public String getFavoringName() {
		return favoringName;
	}

	public void setFavoringName(String favoringName) {
		this.favoringName = favoringName;
	}

	public String getFavoringAddress() {
		return favoringAddress;
	}

	public void setFavoringAddress(String favoringAddress) {
		this.favoringAddress = favoringAddress;
	}
	
	
}
