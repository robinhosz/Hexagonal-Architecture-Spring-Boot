package br.com.robinhosz.hexagonal.application.ports.out;

import br.com.robinhosz.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
