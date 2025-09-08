package com.poc.hexagonal.application.core.usecase;

import com.poc.hexagonal.application.core.domain.Customer;
import com.poc.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.poc.hexagonal.application.ports.in.UpdateCostumerInputPort;
import com.poc.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.poc.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.web.bind.annotation.GetMapping;

public class UpdateCustomerUseCase implements UpdateCostumerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort
    ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
