package com.br.ceccoff.hexagonal_client_crud.infrastructure.config;

import com.br.ceccoff.hexagonal_client_crud.application.ports.out.CustomerRepository;
import com.br.ceccoff.hexagonal_client_crud.application.services.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CustomerService customerService(CustomerRepository customerRepository) {
        return new CustomerService(customerRepository);
    }
}