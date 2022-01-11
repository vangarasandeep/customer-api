package com.acc.training.customerapi.controller;

import javax.validation.Valid;

import com.acc.training.customerapi.api.CustomerApi;
import com.acc.training.customerapi.model.Customer;
import com.acc.training.customerapi.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController implements CustomerApi {

    @Autowired
    private CustomerService custService;

    @Override
    public ResponseEntity<Customer> createCustomer(@Valid Customer body) {   
        Customer customer = custService.createCustomer(body);        
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }

    @Override
    public ResponseEntity<Customer> getCustomer(String id) {
        Customer customer = custService.getCustomer(id);
        if (customer == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }
    
}
