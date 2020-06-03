package com.jtorres.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jtorres.service.CustomerService;

@Controller
@RequestMapping("/rulesheet")
public class RulesheetController {

	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/list")
	public String showPage() {
		return "list-rulesheet";
	}
	
}
