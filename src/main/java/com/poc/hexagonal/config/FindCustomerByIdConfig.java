package com.poc.hexagonal.config;

import com.poc.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.poc.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(
                findCustomerByIdAdapter
        );
    }

}
