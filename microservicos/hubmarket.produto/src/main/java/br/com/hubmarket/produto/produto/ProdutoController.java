package br.com.hubmarket.produto.produto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hubmarket.produto.categoria.CategoriaEntity;
import br.com.hubmarket.produto.categoria.CategoriaRepository;
import br.com.hubmarket.produto.fornecedor.FornecedorService;

@RestController
@CrossOrigin(origins = "${cors.allowed-origins}")
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	protected ProdutoRepository produtoRepository;
	
	
	@Autowired
	private FornecedorService fornecedorService; 

/*	@GetMapping("/categoria/{idCategoria}")
	public List<ProdutoDTO> listarPorCategoria(@PathVariable Long idCategoria) {
		CategoriaEntity categoriaEntity = new CategoriaEntity();
		categoriaEntity.setId(idCategoria);
		
		List<ProdutoDTO> listaProdutoDTO =  new ArrayList<ProdutoDTO>();
		List<ProdutoEntity> listaProdutoEntity =  this.produtoRepository.findByCategoria(categoriaEntity);
		
		for (ProdutoEntity produtoEntity : listaProdutoEntity) {
			ProdutoDTO produtoDTO = transformaEntityEmDTO(produtoEntity);					
			listaProdutoDTO.add(produtoDTO);
		}
		
		return listaProdutoDTO;
	}*/
	
	@GetMapping("/{descricao}")
	public List<ProdutoDTO> listarPorDescricao(@PathVariable String descricao) {
			
		List<ProdutoDTO> listaProdutoDTO =  new ArrayList<ProdutoDTO>();
		List<ProdutoEntity> listaProdutoEntity =  this.produtoRepository.findByDescricaoContaining(descricao);
				
		
		for (ProdutoEntity produtoEntity : listaProdutoEntity) {
			ProdutoDTO produtoDTO = transformaEntityEmDTO(produtoEntity);					
			listaProdutoDTO.add(produtoDTO);
		}
		
		return listaProdutoDTO;
	}
	
		
	private static ProdutoDTO transformaEntityEmDTO(ProdutoEntity produtoEntity ) {
	    return new ProdutoDTO(produtoEntity.getId(), produtoEntity.getCodigo(), produtoEntity.getDescricao(), 
	    					  produtoEntity.getClassificacao(), produtoEntity.getMenorPreco() );
	}
	
}
