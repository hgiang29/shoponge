package com.shoponge.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shoponge.common.entity.Customer;
import com.shoponge.customer.CustomerRepository;

public class CustomerUserDetailsService implements UserDetailsService {
	
	@Autowired private CustomerRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Customer customer = repo.findByEmail(email);
		if (customer == null) 
			throw new UsernameNotFoundException("No customer found with the email " + email);
		
		return new CustomerUserDetails(customer);
	}

}
