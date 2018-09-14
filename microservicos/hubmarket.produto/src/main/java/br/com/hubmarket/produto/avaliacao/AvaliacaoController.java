package br.com.hubmarket.produto.avaliacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hubmarket.produto.produto.ProdutoDTO;

@RestController
@CrossOrigin(origins = "${cors.allowed-origins}")
@RequestMapping(value = "/avaliacao")
public class AvaliacaoController {

	@Autowired
	protected AvaliacaoRepository avaliacaoRepository;
	
	@GetMapping("listarPorDataCriacao/{dataInicio}/{dataFim}")
	public List<AvaliacaoDTO>  listarPorDataCriacao(@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy")  Date dataInicio, @PathVariable  @DateTimeFormat(pattern = "dd-MM-yyyy")  Date dataFim) {
				
		List<AvaliacaoEntity> listaAvaliacaoEntity =  this.avaliacaoRepository.findAllByDataCriacaoBetween(dataInicio, dataFim);
		
		List<AvaliacaoDTO> listaAvaliacaoDTO =  new ArrayList<AvaliacaoDTO>();
		for (AvaliacaoEntity avaliacaoEntity : listaAvaliacaoEntity) {
			AvaliacaoDTO avaliacaoDTO = new AvaliacaoDTO(avaliacaoEntity.getId(), avaliacaoEntity.getClassificacao(), avaliacaoEntity.getDescricao(),avaliacaoEntity.getDataCriacao());
			
			ProdutoDTO produtoDTO = new ProdutoDTO();
			produtoDTO.setId(avaliacaoEntity.getProduto().getId());
			produtoDTO.setCodigo(avaliacaoEntity.getProduto().getCodigo());
			produtoDTO.setDescricao(avaliacaoEntity.getProduto().getDescricao());
			
			avaliacaoDTO.setProduto(produtoDTO);
			
			listaAvaliacaoDTO.add(avaliacaoDTO);
		}
		
		return listaAvaliacaoDTO;
	}
	
}
