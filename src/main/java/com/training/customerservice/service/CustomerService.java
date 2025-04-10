package com.training.customerservice.service;

import com.training.customerservice.model.Customer;

public interface CustomerService {
    Customer registerCustomer(Customer customer);
    Customer getCustomerById(Long id);
    Customer updateCustomer(Long id, Customer customer);
}
