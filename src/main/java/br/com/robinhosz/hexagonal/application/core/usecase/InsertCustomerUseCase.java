package br.com.robinhosz.hexagonal.application.core.usecase;

import br.com.robinhosz.hexagonal.application.core.domain.Customer;
import br.com.robinhosz.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

public class InsertCustomerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
    }

    public void insert(Customer customer, String zipcode) {
        var address = findAddressByZipCodeOutputPort.find(zipcode);
        customer.setAddress(address);

    }
}
