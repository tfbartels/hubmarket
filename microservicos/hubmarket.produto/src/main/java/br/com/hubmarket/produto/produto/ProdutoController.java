package br.com.hubmarket.produto.produto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hubmarket.produto.fornecedor.FornecedorService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	protected ProdutoRepository produtoRepository;
	
	@Autowired
	private FornecedorService fornecedorService; 

	@GetMapping
	public List<ProdutoDTO> listar() {
		List<ProdutoDTO> listaProdutoDTO =  new ArrayList<ProdutoDTO>();
		List<ProdutoEntity> listaProdutoEntity =  this.produtoRepository.findAll();
		
		for (ProdutoEntity produtoEntity : listaProdutoEntity) {
			ProdutoDTO produtoDTO = produtoEntity.transformaEmDTO();
			produtoDTO.setFornecedor(fornecedorService.buscaFornecedorPorId(produtoEntity.getIdFornecedor()));
			
			listaProdutoDTO.add(produtoDTO);
		}
		
		return listaProdutoDTO;
	}
}
