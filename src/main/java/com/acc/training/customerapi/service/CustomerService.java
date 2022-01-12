package com.acc.training.customerapi.service;

import javax.validation.Valid;

import com.acc.training.customerapi.Repository.CustomerRepository;
import com.acc.training.customerapi.model.Customer;
import com.acc.training.domain.CustomerDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer createCustomer(@Valid Customer body) {
       // return repository.saveCustomer(body);
       CustomerDomain customerDomain=mapModelToDomain(body);
       return mapDomainToModel(repository.save(customerDomain));

    }

    public Customer getCustomer(String id) {
        //return repository.getCustomer(id);
        return mapDomainToModel(repository.findByCustomerId(id));
    }

    private CustomerDomain mapModelToDomain(Customer body) {
        CustomerDomain customerDomain = new CustomerDomain(); 
        customerDomain.setCustomerName(body.getCustomerName());
        customerDomain.setCustomerId(body.getCustomerId());
        customerDomain.setCustomerAddress(body.getCustomerAddress());
         return customerDomain;}

         private Customer mapDomainToModel(CustomerDomain customerDomain) {
            Customer customer = new Customer();
            customer.setCustomerName(customerDomain.getCustomerName());
            customer.setCustomerId(customerDomain.getCustomerId());
            customer.setCustomerAddress(customerDomain.getCustomerAddress()); return customer;}

    
}
