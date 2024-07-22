package com.br.ceccoff.hexagonal_client_crud.infrastructure.adapters.in.web;

import com.br.ceccoff.hexagonal_client_crud.application.ports.in.CreateCustomerUseCase;
import com.br.ceccoff.hexagonal_client_crud.application.ports.in.ListCustomerUseCase;
import com.br.ceccoff.hexagonal_client_crud.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CreateCustomerUseCase createCustomerUseCase;

    private final ListCustomerUseCase listCustomersUseCase;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return createCustomerUseCase.createCustomer(customer);
    }

    @GetMapping
    public List<Customer> listCustomers() {
        return listCustomersUseCase.listCustomers();
    }
}