package com.poc.hexagonal.config;

import com.poc.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.poc.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.poc.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(
                findCustomerByIdUseCase,
                deleteCustomerByIdAdapter
        );
    }

}
