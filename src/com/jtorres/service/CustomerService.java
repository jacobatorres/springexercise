package com.jtorres.service;

import java.util.List;

import com.jtorres.springexercise.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
	
}
