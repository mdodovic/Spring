package com.mdodovic.employeemanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mdodovic.employeemanagement.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

		List<Employee> employees = theQuery.getResultList();
		
		return employees;
	}

}
