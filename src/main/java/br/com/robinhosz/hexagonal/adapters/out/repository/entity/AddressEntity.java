package br.com.robinhosz.hexagonal.adapters.out.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressEntity {

    private String street;
    private String city;
    private String state;
}
