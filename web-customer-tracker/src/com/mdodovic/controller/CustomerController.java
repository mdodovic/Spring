package com.mdodovic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mdodovic.dao.CustomerDAO;
import com.mdodovic.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		List<Customer> allCustomers = customerDAO.getCustomers();
		
		model.addAttribute("customers", allCustomers);
		
		return "list-customers";
	}
	
}
