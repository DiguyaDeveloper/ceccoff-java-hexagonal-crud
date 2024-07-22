package com.br.ceccoff.hexagonal_client_crud.application.ports.in;

import com.br.ceccoff.hexagonal_client_crud.domain.Customer;

import java.util.List;

public interface ListCustomerUseCase {
    List<Customer> listCustomers();
}