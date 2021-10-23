package com.mdodovic.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mdodovic.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO{	
	
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> allCustomersQuerry = currentSession.createQuery("from Customer", Customer.class);

		List<Customer> customers = allCustomersQuerry.getResultList();
		
		return customers;
		
	}

}
