package br.com.hubmarket.produto.fornecedor;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url="http://localhost:8090/fornecedor/", name = "fornecedor")
@FeignClient(value = "usuario", path = "/fornecedor")
public interface FornecedorService {

	@GetMapping("{id}")
	FornecedorDTO buscaFornecedorPorId(@PathVariable("id") Long id);
}
