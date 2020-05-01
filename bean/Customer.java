package com.capgemini.bean;

import java.time.LocalDate;
import java.util.List;

public class Customer {

	private String customerId;
	private String customerName; 
	private String customerPassword; 
	private LocalDate dateOfBirth; 
	private List<Ticket> myTickets; 
	private String customerContact;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<Ticket> getMyTickets() {
		return myTickets;
	}
	public void setMyTickets(List<Ticket> myTickets) {
		this.myTickets = myTickets;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	} 

}
