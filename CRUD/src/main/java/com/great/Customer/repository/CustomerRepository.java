package com.great.Customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.great.Customer.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
