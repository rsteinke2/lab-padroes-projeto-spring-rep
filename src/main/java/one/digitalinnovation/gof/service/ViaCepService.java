package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 Client HTTP, criado via "OpenFeign", para o consumo da API do ViaCEP.
  Referência da declaração do Spring OpenFeign Cloud link: "https://spring.io/projects/spring-cloud-openfeign"
 Link de dados de ViaCEP: "https://viacep.com.br"
 */

 @FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
 public interface ViaCepService {

        @GetMapping("/{cep}/json/")
        Endereco consultarCep(@PathVariable("cep") String cep);
    }
