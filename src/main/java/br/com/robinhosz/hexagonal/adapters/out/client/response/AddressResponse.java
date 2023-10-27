package br.com.robinhosz.hexagonal.adapters.out.client.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressResponse {
    private String street;
    private String city;
    private String state;
}