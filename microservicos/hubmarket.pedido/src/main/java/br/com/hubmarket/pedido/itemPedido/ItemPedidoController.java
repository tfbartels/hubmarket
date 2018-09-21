package br.com.hubmarket.pedido.itemPedido;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hubmarket.pedido.fornecedor.FornecedorDTO;
import br.com.hubmarket.pedido.fornecedor.FornecedorService;

@RestController
@CrossOrigin(origins = "${cors.allowed-origins}")
@RequestMapping(value = "/itempedido")
public class ItemPedidoController {

	@Autowired
	private FornecedorService fornecedorService;

	@GetMapping("/obterfreteprazoentrega/{idFornecedor}/{cep}")
	public ItemPedidoDTO obterFretePrazoEntrega(@PathVariable Long idFornecedor, @PathVariable String cep) {

		FornecedorDTO fornecedorDTO = fornecedorService.buscaFornecedorPorId(idFornecedor);
		ItemPedidoDTO itemPedido = new ItemPedidoDTO();

		itemPedido.setValorFrete(new BigDecimal(20));
		itemPedido.setPrazoEntrega("10 dias");

		return itemPedido;
	}

}
