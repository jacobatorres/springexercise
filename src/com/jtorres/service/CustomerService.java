package com.jtorres.service;

import java.util.List;

import com.jtorres.springexercise.entity.Customer;
import com.jtorres.springexercise.entity.Rulesheet;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public List<Rulesheet> getRulesheets();
	
	
}
