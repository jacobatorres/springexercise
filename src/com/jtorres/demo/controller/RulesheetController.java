package com.jtorres.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
}
