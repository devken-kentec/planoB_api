package br.com.kentec.planoB.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.planoB.domain.Empresa;
import br.com.kentec.planoB.repository.EmpresaRepository;


@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository er;
	
	public Empresa save(Empresa empresa) {
		return er.save(empresa);
	}
	
	public Empresa update(Empresa empresa) {
		Optional<Empresa> _empresa = er.findById(empresa.getId());
		if(_empresa.isPresent()) {
			_empresa.get().setId(empresa.getId());
			_empresa.get().setNomeFantasia(empresa.getNomeFantasia());
			_empresa.get().setCep(empresa.getCep());
			_empresa.get().setEndereco(empresa.getEndereco());
			_empresa.get().setComplemento(empresa.getComplemento());
			_empresa.get().setTelefone(empresa.getTelefone());
			_empresa.get().setWhatsapp(empresa.getWhatsapp());
			_empresa.get().setStatus(empresa.getStatus());
		}
		return er.save(_empresa.get());
	}
}
