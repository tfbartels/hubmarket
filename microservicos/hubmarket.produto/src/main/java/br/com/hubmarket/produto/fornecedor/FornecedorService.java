package br.com.hubmarket.produto.fornecedor;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "usuario", path = "/fornecedor")
public interface FornecedorService {

	@GetMapping("{id}")
	FornecedorDTO buscaFornecedorPorId(@PathVariable("id") Long id);
}
