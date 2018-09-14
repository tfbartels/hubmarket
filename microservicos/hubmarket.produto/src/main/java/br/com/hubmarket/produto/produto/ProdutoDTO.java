package br.com.hubmarket.produto.produto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.hubmarket.produto.avaliacao.AvaliacaoDTO;
import br.com.hubmarket.produto.categoria.CategoriaDTO;
import br.com.hubmarket.produto.produtofornecedor.ProdutoFornecedorDTO;

@JsonInclude(Include.NON_NULL)
public class ProdutoDTO {
	
	private Long id;
	private String codigo;	
	private String descricao;
	private String urlImagem;
	private CategoriaDTO categoria;
	private List<ProdutoFornecedorDTO> listaProdutoFornecedor;
	private Integer classificacao;
	private BigDecimal menorPreco;
	private String detalhes;	
	private List<AvaliacaoDTO> listaAvaliacao;
	
	
	public ProdutoDTO() {
		
	}
	
	public ProdutoDTO(Long id, String codigo, String descricao, String urlImagem, Integer classificacao, BigDecimal menorPreco) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.urlImagem = urlImagem;
		this.classificacao = classificacao;
		this.menorPreco = menorPreco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

		
	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}
		

	public List<ProdutoFornecedorDTO> getListaProdutoFornecedor() {
		return listaProdutoFornecedor;
	}

	public void setListaProdutoFornecedor(List<ProdutoFornecedorDTO> listaProdutoFornecedor) {
		this.listaProdutoFornecedor = listaProdutoFornecedor;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	public BigDecimal getMenorPreco() {
		return menorPreco;
	}

	public void setMenorPreco(BigDecimal menorPreco) {
		this.menorPreco = menorPreco;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public List<AvaliacaoDTO> getListaAvaliacao() {
		return listaAvaliacao;
	}

	public void setListaAvaliacao(List<AvaliacaoDTO> listaAvaliacao) {
		this.listaAvaliacao = listaAvaliacao;
	}
	
	

}
