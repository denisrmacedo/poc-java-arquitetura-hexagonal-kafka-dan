package com.poc.hexagonal.adapters.out.client.mapper;

import com.poc.hexagonal.adapters.out.client.response.AddressResponse;
import com.poc.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
