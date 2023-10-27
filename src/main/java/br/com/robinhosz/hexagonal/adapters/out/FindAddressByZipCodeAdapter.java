package br.com.robinhosz.hexagonal.adapters.out;

import br.com.robinhosz.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import br.com.robinhosz.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import br.com.robinhosz.hexagonal.application.core.domain.Address;
import br.com.robinhosz.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
