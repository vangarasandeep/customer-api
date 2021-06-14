package com.acc.training.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.domain.CustomerDomain;
import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer createCustomer(@Valid Customer body) {
        CustomerDomain customerDomain = mapModelToDomain(body);
        return mapDomainToModel(repository.save(customerDomain));
    }

    public Customer getCustomer(String id) {
        if(null == repository.findByCustomerId(id)){
            return null;
        }
        return mapDomainToModel(repository.findByCustomerId(id));
    }

    private Customer mapDomainToModel(CustomerDomain customerDomain) {
        Customer customer = new Customer();
        customer.setCustomerId(customerDomain.getCustomerId());
        customer.setCustomerName(customerDomain.getCustomerName());
        customer.setCustomerAddress(customerDomain.getCustomerAddress());
        customer.setOfficeCode(customerDomain.getOfficeCode());
        return customer;
    }

    private CustomerDomain mapModelToDomain(@Valid Customer body) {
        CustomerDomain customerDomain = new CustomerDomain();
        customerDomain.setCustomerId(body.getCustomerId());
        customerDomain.setCustomerName(body.getCustomerName());
        customerDomain.setCustomerAddress(body.getCustomerAddress());
        customerDomain.setOfficeCode(body.getOfficeCode());
        return customerDomain;
    }

   
    
}
