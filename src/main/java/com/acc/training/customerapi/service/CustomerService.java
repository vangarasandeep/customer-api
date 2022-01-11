package com.acc.training.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.repository.CustomerRepository;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository repository;
    public Customer getCustomer(String id) {
        return repository.getCustomer(id);
    }

    public Customer createCustomer(@Valid Customer body) {
        return repository.saveCustomer(body);
    }
    
}
