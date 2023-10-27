package br.com.robinhosz.hexagonal.adapters.out.client.mapper;

import br.com.robinhosz.hexagonal.adapters.out.client.response.AddressResponse;
import br.com.robinhosz.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
