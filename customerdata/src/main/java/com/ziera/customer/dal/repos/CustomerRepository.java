package com.ziera.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.ziera.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
