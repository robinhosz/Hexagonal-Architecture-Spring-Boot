package br.com.robinhosz.hexagonal.adapters.in.controller.mapper;

import br.com.robinhosz.hexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.robinhosz.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

}
