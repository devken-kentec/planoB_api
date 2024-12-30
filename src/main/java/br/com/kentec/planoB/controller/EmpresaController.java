package br.com.kentec.planoB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.planoB.domain.Empresa;
import br.com.kentec.planoB.service.EmpresaService;


@RestController
@RequestMapping("/plano-b/api/empresa/v1")
public class EmpresaController {
	
	@Autowired
	private EmpresaService es;
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa gravar(@RequestBody Empresa empresa) {
		return es.save(empresa);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Empresa update(@RequestBody Empresa empresa) {
		return es.update(empresa);
	}
	
}
