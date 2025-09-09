package com.poc.hexagonal.application.ports.in;

import com.poc.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
