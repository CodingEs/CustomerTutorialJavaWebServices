package com.ziera.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ziera.customer.dal.entities.Customer;
import com.ziera.customer.dal.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer() {
		
		Customer customer = new Customer();
		customer.setName("Sam");
		customer.setEmail("sam@javawebservices.org");
		
		customerRepository.save(customer);
	}
	
	@Test
	public void testFindCustomerById() {
		Customer customer = customerRepository.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test
	public void testUpdateCustomerById() {
		Customer customer = customerRepository.findById(1l).get();
		customer.setEmail("sam001@javawebservices.org");
		
		customerRepository.save(customer);
	}
	
	@Test
	public void testDeleteCustomerById() {
		Customer customer = new Customer();
		customer.setId(1l);
		customerRepository.delete(customer);		
	}
	
	
}

