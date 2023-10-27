package br.com.robinhosz.hexagonal.adapters.out.client;

import br.com.robinhosz.hexagonal.adapters.out.client.response.AddressResponse;
import jakarta.websocket.server.PathParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "findAddressByZipCodeClient", url = "${robinhosz.client.address.url}")
public interface FindAddressByZipCodeClient {


    @GetMapping(value = "/{zipcode}")
    AddressResponse find(@PathVariable("zipcode") String zipcode);

}