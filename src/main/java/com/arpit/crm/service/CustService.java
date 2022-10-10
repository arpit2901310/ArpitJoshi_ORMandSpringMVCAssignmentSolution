package com.arpit.crm.service;

import java.util.List;

import com.arpit.crm.entity.Customer;




public interface CustService {

	public List<Customer> findAll();
	
	public Customer findById(int theId);

	public void save(Customer theCustomer);
	
	public void deleteById(int theId);

}