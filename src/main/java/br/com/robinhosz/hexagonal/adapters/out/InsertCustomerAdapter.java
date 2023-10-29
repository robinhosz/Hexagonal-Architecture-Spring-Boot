package br.com.robinhosz.hexagonal.adapters.out;

import br.com.robinhosz.hexagonal.adapters.out.repository.CustomerRepository;
import br.com.robinhosz.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.robinhosz.hexagonal.application.core.domain.Customer;
import br.com.robinhosz.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        customerRepository.save(customerEntityMapper.toCustomerEntity(customer));
    }
}
