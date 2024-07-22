package com.br.ceccoff.hexagonal_client_crud.infrastructure.adapters.out.persistence;


import com.br.ceccoff.hexagonal_client_crud.application.ports.out.CustomerRepository;
import com.br.ceccoff.hexagonal_client_crud.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerRepositoryAdapter implements CustomerRepository {

    @Autowired
    private SpringDataCustomerRepository springDataCustomerRepository;

    @Override
    public Customer save(Customer customer) {
        CustomerEntity entity = new CustomerEntity();
        entity.setName(customer.getName());
        entity.setEmail(customer.getEmail());
        entity = springDataCustomerRepository.save(entity);
        customer.setId(entity.getId());
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        return springDataCustomerRepository.findAll().stream()
                .map(entity -> {
                    Customer customer = new Customer();
                    customer.setId(entity.getId());
                    customer.setName(entity.getName());
                    customer.setEmail(entity.getEmail());
                    return customer;
                })
                .collect(Collectors.toList());
    }
}