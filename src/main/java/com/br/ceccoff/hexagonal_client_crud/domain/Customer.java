package com.br.ceccoff.hexagonal_client_crud.domain;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String name;
    private String email;
}
