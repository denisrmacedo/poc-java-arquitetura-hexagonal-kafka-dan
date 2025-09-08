package com.poc.hexagonal.application.ports.out;

import com.poc.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
