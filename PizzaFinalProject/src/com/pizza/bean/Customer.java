package com.pizza.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer2")
public class Customer {
    @Id
	@GeneratedValue
	@Column(name="cid")
	 int customerId;
   @NotEmpty(message="can't be empty")
   @Column(name="cname")
	 String name; 
   
   @Column(name="caddress")
	 String address; 
   
	@Column(name="cphone")
	String phone;
   
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
