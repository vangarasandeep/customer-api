package com.acc.training.customerapi.Repository;

import java.util.HashMap;
import java.util.Map;

import com.acc.training.customerapi.model.Customer;
import com.acc.training.domain.CustomerDomain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends MongoRepository<CustomerDomain, String>{

    public CustomerDomain findByCustomerId(String customerId);
    
}
