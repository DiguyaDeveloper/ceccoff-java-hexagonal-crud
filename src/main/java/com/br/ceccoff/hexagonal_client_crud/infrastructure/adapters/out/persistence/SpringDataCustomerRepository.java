package com.br.ceccoff.hexagonal_client_crud.infrastructure.adapters.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCustomerRepository extends JpaRepository<CustomerEntity, Long> {
}