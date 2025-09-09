package com.poc.hexagonal.application.ports.in;

import com.poc.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
