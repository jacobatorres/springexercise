package com.jtorres.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jtorres.service.CustomerService;
import com.jtorres.springexercise.entity.Customer;
import com.jtorres.springexercise.entity.Rulesheet;

@Controller
@RequestMapping("/rulesheet")
public class RulesheetController {

	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/list")
	public String showPage(Model theModel) {
		
		// get rulesheets
		List<Rulesheet> rulesheets = customerservice.getRulesheets();
		
		// add to model
		
		
		
		theModel.addAttribute("rulesheet", rulesheets);
		
		return "list-rulesheet";
	}
	
	
	@GetMapping("/showFormAddRulesheet") 
	public String showFormAddRulesheet(Model theModel) {
		Rulesheet therulesheet = new Rulesheet();
		
		theModel.addAttribute("rulesheet", therulesheet);


		return "rulesheet-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerservice.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}

	
	@PostMapping("/processRulesheet")
	public String saveRulesheet(@Valid @ModelAttribute("rulesheet") Rulesheet therulesheet, 
			BindingResult theBindingResult) {
		
		if (theBindingResult.hasErrors()) {
			return "rulesheet-form";
		} else {
			// needed: type, customerID and filecontent
			
			
			// customerservice.saveRulesheet(therulesheet);
			return "redirect:/rulesheet/list";
			
		}
		
		
	}
	
	
	
}
