package br.com.robinhosz.hexagonal.adapters.out.repository.mapper;

import br.com.robinhosz.hexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.robinhosz.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
        CustomerEntity toCustomerEntity(Customer customer);
}