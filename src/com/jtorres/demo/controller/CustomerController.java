package com.jtorres.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jtorres.DAO.CustomerDAO;
import com.jtorres.service.CustomerService;
import com.jtorres.springexercise.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		
		List<Customer> theCustomers = customerservice.getCustomers();
		
		theModel.addAttribute("customers", theCustomers);
		
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd") 
	public String ShowAddCustomerPage(Model theModel) {
			
		Customer thecustomer = new Customer();
		
		theModel.addAttribute("customer", thecustomer);
		
		return "customer-form";
	}
}
