package com.acc.training.customerapi.service;

import com.acc.training.customerapi.Repository.CustomerRepository;
import com.acc.training.customerapi.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired

    private CustomerRepository custRepo;

    public Customer createCustomer(Customer cust) {
        return custRepo.saveCustomer(cust);
    }

    public Customer getCustomer(String id) {
        return custRepo.getCustomer(id);
    }
    
}
