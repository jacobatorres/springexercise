package com.jtorres.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jtorres.DAO.CustomerDAO;
import com.jtorres.DAO.RulesheetDAO;
import com.jtorres.springexercise.entity.Customer;
import com.jtorres.springexercise.entity.Rulesheet;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private RulesheetDAO rulesheetDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		customerDAO.saveCustomer(theCustomer);
		
	}
	
	@Override
	@Transactional
	public List<Rulesheet> getRulesheets() {
		return rulesheetDAO.getRulesheets();
	}

	@Override
	@Transactional
	public void saveRulesheet(@Valid Rulesheet therulesheet) {
		rulesheetDAO.saveRulesheet(therulesheet);
		
	}
	
	

}
