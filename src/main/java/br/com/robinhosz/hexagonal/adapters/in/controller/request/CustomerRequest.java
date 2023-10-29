package br.com.robinhosz.hexagonal.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerRequest {

    @NotBlank(message = "Name is mandatory")
    private String name;
    @NotBlank(message = "Cpf is mandatory")
    private String cpf;
    @NotBlank(message = "zipcode is mandatory")
    private String zipcode;

}