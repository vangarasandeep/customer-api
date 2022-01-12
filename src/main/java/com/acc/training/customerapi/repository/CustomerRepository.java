package com.acc.training.customerapi.repository;

import com.acc.training.customerapi.domain.CustomerDomain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerDomain, String> {

    CustomerDomain findByCustomerId(String customerId);
}
