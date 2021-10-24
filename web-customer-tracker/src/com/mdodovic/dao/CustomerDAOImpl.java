package com.mdodovic.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mdodovic.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{	
	
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public List<Customer> getCustomers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> allCustomersQuerry = currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> customers = allCustomersQuerry.getResultList();
		
		return customers;
		
	}

	@Override
	public void saveCustomer(Customer customer) {

		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(customer);		
		
	}

	@Override
	public Customer getCustomer(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		return currentSession.get(Customer.class, id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void deleteCustomer(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query deleteCustomerQuerry = currentSession.createQuery("delete from Customer where id=:customerId");

		deleteCustomerQuerry.setParameter("customerId", id);
		
		deleteCustomerQuerry.executeUpdate();
	}

}
