package com.boot.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity  
 public class AmazonOrder {
    @Id  
	 private int oid;
	 private double amount;
	 private String city;
	 private String email;
	 private String gender;
	 private int no_of_items;
	 private int pincode;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getNo_of_items() {
		return no_of_items;
	}
	public void setNo_of_items(int no_of_items) {
		this.no_of_items = no_of_items;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AmazonOrder [oid=" + oid + ", amount=" + amount + ", city=" + city + ", email=" + email + ", gender="
				+ gender + ", no_of_items=" + no_of_items + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}













