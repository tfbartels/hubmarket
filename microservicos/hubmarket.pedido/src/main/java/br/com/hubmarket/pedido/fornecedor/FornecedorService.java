package br.com.hubmarket.pedido.fornecedor;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "usuario", path = "/fornecedor")
public interface FornecedorService {

	@GetMapping("/buscaurlservicofreteprazoentrega/{id}")
	String buscaUrlServicoFretePrazoEntrega(@PathVariable("id") Long id);
}
