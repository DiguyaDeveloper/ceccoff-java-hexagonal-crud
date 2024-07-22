package com.br.ceccoff.hexagonal_client_crud.application.ports.in;

import com.br.ceccoff.hexagonal_client_crud.domain.Customer;

public interface CreateCustomerUseCase {
    Customer createCustomer(Customer customer);
}