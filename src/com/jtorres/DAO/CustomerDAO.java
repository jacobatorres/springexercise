package com.jtorres.DAO;

import java.util.List;

import javax.validation.Valid;

import com.jtorres.springexercise.entity.Customer;
import com.jtorres.springexercise.entity.Rulesheet;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);


}
