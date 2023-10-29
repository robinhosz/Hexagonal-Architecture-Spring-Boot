package br.com.robinhosz.hexagonal.application.ports.in;

import br.com.robinhosz.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipcode);

}
