package com.acc.training.customerapi.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.acc.training.customerapi.model.Customer;

@Repository
public class CustomerRepository {

    private static final Map<String, Customer> customerMap = new HashMap<>();

    static {
        initCustomerDb();
    }

    private static void initCustomerDb() {

        Customer customer1 = new Customer();
        customer1.setCustomerId("12345");
        customer1.setCustomerName("Joe Doe");
        customer1.customerAddress("1000 Main Street");

        Customer customer2 = new Customer();
        customer2.setCustomerId("12348");
        customer2.setCustomerName("Jane Doe");
        customer2.customerAddress("2000 Main Street");

        customerMap.put(customer1.getCustomerId(), customer1);
        customerMap.put(customer2.getCustomerId(), customer2);
    }

    public Customer getCustomer(String id) {
        return customerMap.get(id);
    }

    public Customer saveCustomer(Customer customer) {
        customerMap.put(customer.getCustomerId(), customer);
        return customerMap.get(customer.getCustomerId());
    }
}
