package com.expertsclub.openfeign.client;

import com.expertsclub.openfeign.dto.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-api", url = "https://api.postmon.com.br", path = "/v1/cep")
public interface AddressAPI {

    @GetMapping("/{cep}")
    AddressDTO findByCep(@PathVariable String cep);

}
