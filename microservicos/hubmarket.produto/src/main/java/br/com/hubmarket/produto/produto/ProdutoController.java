package br.com.hubmarket.produto.produto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hubmarket.produto.avaliacao.AvaliacaoDTO;
import br.com.hubmarket.produto.avaliacao.AvaliacaoEntity;
import br.com.hubmarket.produto.avaliacao.AvaliacaoRepository;
import br.com.hubmarket.produto.fornecedor.FornecedorDTO;
import br.com.hubmarket.produto.fornecedor.FornecedorService;
import br.com.hubmarket.produto.produtofornecedor.ProdutoFornecedorDTO;
import br.com.hubmarket.produto.produtofornecedor.ProdutoFornecedorEntity;
import br.com.hubmarket.produto.produtofornecedor.ProdutoFornecedorRepository;

@RestController
@CrossOrigin(origins = "${cors.allowed-origins}")
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	protected ProdutoRepository produtoRepository;
	
	@Autowired
	protected ProdutoFornecedorRepository produtoFornecedorRepository;
	
	@Autowired
	protected AvaliacaoRepository avaliacaoRepository;
	
	@Autowired
	private FornecedorService fornecedorService; 

	@GetMapping("/{id}")
	public ProdutoDTO buscaPorId(@PathVariable Long id) {
					
		ProdutoEntity produtoEntity =  produtoRepository.findById(id).get();	
	    ProdutoDTO produtoDTO = new ProdutoDTO(produtoEntity.getId(), produtoEntity.getCodigo(), produtoEntity.getDescricao(), 
				   					produtoEntity.getUrlImagem(), produtoEntity.getClassificacao(), produtoEntity.getMenorPreco());
	    produtoDTO.setDetalhes(produtoEntity.getDetalhes());
	    	    
	    
	    //Lista Produto Fornecedor
	    produtoDTO.setListaProdutoFornecedor(new ArrayList<ProdutoFornecedorDTO>());	    	   
		for (ProdutoFornecedorEntity produtoFornecedorEntity : produtoFornecedorRepository.findByProduto(produtoEntity)) {
			 FornecedorDTO fornecedorDTO = fornecedorService.buscaFornecedorPorId(produtoFornecedorEntity.getIdFornecedor());
			 ProdutoFornecedorDTO produtoFornecedorDTO = new ProdutoFornecedorDTO(produtoFornecedorEntity.getId(), fornecedorDTO, 
					 										 produtoFornecedorEntity.getQuantidade(), produtoFornecedorEntity.getValorVenda());
			 			 
			 produtoDTO.getListaProdutoFornecedor().add(produtoFornecedorDTO);
		}
		
		//Lista Avaliacoes
		produtoDTO.setListaAvaliacao(new ArrayList<AvaliacaoDTO>());
		for (AvaliacaoEntity avaliacaoEntity : avaliacaoRepository.findByProduto(produtoEntity)) {			
			 AvaliacaoDTO avaliacaoDTO = new AvaliacaoDTO(avaliacaoEntity.getId(),avaliacaoEntity.getClassificacao(),avaliacaoEntity.getDescricao(), avaliacaoEntity.getDataCriacao());
			 produtoDTO.getListaAvaliacao().add(avaliacaoDTO);
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
												   produtoEntity.getUrlImagem(), produtoEntity.getClassificacao(), produtoEntity.getMenorPreco() );				
			listaProdutoDTO.add(produtoDTO);
		}
		
		return listaProdutoDTO;
	}
	
	
}
