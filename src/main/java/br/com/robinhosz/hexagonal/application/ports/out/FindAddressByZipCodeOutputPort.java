package br.com.robinhosz.hexagonal.application.ports.out;

import br.com.robinhosz.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);
}
