package com.br.ceccoff.hexagonal_client_crud.application.services;

import com.br.ceccoff.hexagonal_client_crud.application.ports.in.CreateCustomerUseCase;
import com.br.ceccoff.hexagonal_client_crud.application.ports.in.ListCustomerUseCase;
import com.br.ceccoff.hexagonal_client_crud.application.ports.out.CustomerRepository;
import com.br.ceccoff.hexagonal_client_crud.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RequiredArgsConstructor
public class CustomerService implements CreateCustomerUseCase, ListCustomerUseCase {

    private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> listCustomers() {
        return customerRepository.findAll();
    }
}