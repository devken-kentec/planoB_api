package br.com.kentec.planoB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.planoB.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
