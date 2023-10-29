package br.com.robinhosz.hexagonal.config;

import br.com.robinhosz.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import br.com.robinhosz.hexagonal.adapters.out.InsertCustomerAdapter;
import br.com.robinhosz.hexagonal.adapters.out.SendCpfValidationAdapter;
import br.com.robinhosz.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
    InsertCustomerAdapter insertCustomerAdapter, SendCpfValidationAdapter sendCpfValidationAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }

}