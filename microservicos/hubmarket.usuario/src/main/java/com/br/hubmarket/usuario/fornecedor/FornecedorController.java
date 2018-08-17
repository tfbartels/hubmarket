package com.br.hubmarket.usuario.fornecedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {

	@Autowired
	protected JpaRepository<FornecedorEntity, Long> fornecedorRepository;

	@GetMapping
	public List<FornecedorEntity> listar() {
		return this.fornecedorRepository.findAll();
	}
}
