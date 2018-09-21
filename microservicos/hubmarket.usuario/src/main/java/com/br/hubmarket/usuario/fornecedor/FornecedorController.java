package com.br.hubmarket.usuario.fornecedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {

	@Autowired
	protected FornecedorRepository fornecedorRepository;


	@GetMapping("/{id}")
	public FornecedorEntity buscaFornecedorPorId(@PathVariable("id") Long id) {
		return this.fornecedorRepository.findById(id).get();
	}
	
	@GetMapping("/buscaurlservicofreteprazoentrega/{id}")
	public String buscaUrlServicoFretePrazoEntrega(@PathVariable("id") Long id) {
		return this.fornecedorRepository.buscaUrlServicoFretePrazoEntrega(id);
	}
}
