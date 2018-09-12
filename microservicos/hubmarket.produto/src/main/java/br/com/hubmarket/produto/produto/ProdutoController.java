package br.com.hubmarket.produto.produto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hubmarket.produto.fornecedor.FornecedorDTO;
import br.com.hubmarket.produto.fornecedor.FornecedorService;
import br.com.hubmarket.produto.produtofornecedor.ProdutoFornecedorDTO;
import br.com.hubmarket.produto.produtofornecedor.ProdutoFornecedorEntity;

@RestController
@CrossOrigin(origins = "${cors.allowed-origins}")
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	protected ProdutoRepository produtoRepository;
	
	
	@Autowired
	private FornecedorService fornecedorService; 

	@GetMapping("/{id}")
	public ProdutoDTO buscaPorId(@PathVariable Long id) {
					
		ProdutoEntity produtoEntity =  this.produtoRepository.findById(id).get();	
	    ProdutoDTO produtoDTO = new ProdutoDTO(produtoEntity.getId(), produtoEntity.getCodigo(), produtoEntity.getDescricao(), 
				   					produtoEntity.getClassificacao(), produtoEntity.getMenorPreco());	   
	    produtoDTO.setProdutoFornecedor(new ArrayList<ProdutoFornecedorDTO>());
	    
		for (ProdutoFornecedorEntity produtoFornecedorEntity : produtoEntity.getProdutoFornecedor()) {
			 FornecedorDTO fornecedorDTO = fornecedorService.buscaFornecedorPorId(produtoFornecedorEntity.getIdFornecedor());
			 ProdutoFornecedorDTO produtoFornecedorDTO = new ProdutoFornecedorDTO(produtoFornecedorEntity.getId(), fornecedorDTO, 
					 										 produtoFornecedorEntity.getQuantidade(), produtoFornecedorEntity.getValorVenda());
			 
			 produtoDTO.getProdutoFornecedor().add(produtoFornecedorDTO);
		}
		
		
		return produtoDTO;
	}
	
/*	@GetMapping("/{id}")
	public ProdutoEntity buscaPorId(@PathVariable Long id) {
					
		ProdutoEntity produtoEntity =  this.produtoRepository.findById(id).get();	
		
		return produtoEntity;
	}
		*/	
	
	@GetMapping("/listarpordescricao/{descricao}")
	public List<ProdutoDTO> listarPorDescricao(@PathVariable String descricao) {
			
		List<ProdutoDTO> listaProdutoDTO =  new ArrayList<ProdutoDTO>();
		List<ProdutoEntity> listaProdutoEntity =  this.produtoRepository.findByDescricaoContaining(descricao);
				
		
		for (ProdutoEntity produtoEntity : listaProdutoEntity) {
			ProdutoDTO produtoDTO = new ProdutoDTO(produtoEntity.getId(), produtoEntity.getCodigo(), produtoEntity.getDescricao(), 
					  							   produtoEntity.getClassificacao(), produtoEntity.getMenorPreco() );				
			listaProdutoDTO.add(produtoDTO);
		}
		
		return listaProdutoDTO;
	}
	
	

	
}
