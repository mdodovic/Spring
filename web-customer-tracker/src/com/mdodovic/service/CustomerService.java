package com.mdodovic.service;

import java.util.List;

import com.mdodovic.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomers(int id);
	
}
