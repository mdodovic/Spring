package com.mdodovic.dao;

import java.util.List;

import com.mdodovic.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
	
}
