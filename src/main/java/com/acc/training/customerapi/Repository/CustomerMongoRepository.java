package com.acc.training.customerapi.Repository;


import com.acc.training.customerapi.domain.CustomerDomain;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerMongoRepository extends MongoRepository<CustomerDomain, String> {
    public CustomerDomain findByCustomerId(String customerId);
   
}