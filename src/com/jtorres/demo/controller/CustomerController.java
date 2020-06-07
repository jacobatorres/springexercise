package com.jtorres.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jtorres.service.CustomerService;
import com.jtorres.springexercise.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		
		String val = "ruleA_13";
		int customer_id_given = Integer.parseInt(val.split("_")[1]);
		
		
		List<Customer> theCustomers = customerservice.getCustomers();
		
		for (var i = 0; i < theCustomers.size(); i++) {
			int id_rightnow = theCustomers.get(i).getId();
			if (id_rightnow  == customer_id_given) {
				System.out.println("ye boy");
			} 
			
			System.out.println(id_rightnow);
		}
		
		theModel.addAttribute("customers", theCustomers);
		
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd") 
	public String ShowAddCustomerPage(Model theModel) {
			
		Customer thecustomer = new Customer();
		
		theModel.addAttribute("customer", thecustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerservice.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
}
