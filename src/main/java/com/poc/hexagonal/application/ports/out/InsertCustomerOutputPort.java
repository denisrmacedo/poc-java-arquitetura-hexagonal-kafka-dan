package com.poc.hexagonal.application.ports.out;

import com.poc.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
