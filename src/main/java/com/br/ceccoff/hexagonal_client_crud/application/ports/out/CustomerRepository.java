package com.br.ceccoff.hexagonal_client_crud.application.ports.out;

import com.br.ceccoff.hexagonal_client_crud.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    Customer save(Customer customer);
    List<Customer> findAll();
}