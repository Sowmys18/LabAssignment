package com.great.Customer.service;

import java.util.List;

import com.great.Customer.model.Customer;

public interface CustomerService {
     List<Customer> getAllCustomers();
    void saveCustomer(Customer customer);
     Customer getCustomerById(long Id);
     void deleteCustomerById(long id);

	
	
}
