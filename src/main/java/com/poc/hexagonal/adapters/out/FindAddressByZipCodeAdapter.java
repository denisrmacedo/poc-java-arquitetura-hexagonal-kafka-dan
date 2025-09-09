package com.poc.hexagonal.adapters.out;

import com.poc.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.poc.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.poc.hexagonal.application.core.domain.Address;
import com.poc.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
