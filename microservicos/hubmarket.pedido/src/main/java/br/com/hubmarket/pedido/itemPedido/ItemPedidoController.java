package br.com.hubmarket.pedido.itemPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.hubmarket.pedido.fornecedor.FornecedorService;

@RestController
@CrossOrigin(origins = "${cors.allowed-origins}")
@RequestMapping(value = "/itempedido")
public class ItemPedidoController {

	@Autowired
	private FornecedorService fornecedorService;

	@GetMapping("/obterfreteprazoentrega/{idFornecedor}/{cep}")
	public ItemPedidoDTO obterFretePrazoEntrega(@PathVariable Long idFornecedor, @PathVariable String cep) {
		RestTemplate restTemplate = new RestTemplate();
		String urlServico = fornecedorService.buscaUrlServicoFretePrazoEntrega(idFornecedor);

		ItemPedidoDTO itemPedido = restTemplate.getForObject(urlServico, ItemPedidoDTO.class, cep);	

		return itemPedido;
	}

}
