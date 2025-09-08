package com.poc.hexagonal.adapters.in.controller.response;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerResponse {

    private String name;

    private String cpf;

    private String zipCode;

    private Boolean isValidCpf;
}
