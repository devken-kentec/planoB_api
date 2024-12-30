package br.com.kentec.planoB.util;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.kentec.planoB.domain.Cep;


public interface CepConsumerFeign {
	
	@GetMapping("/{cep}/json")
	Cep getCep(@PathVariable("cep") String cep); 
}
