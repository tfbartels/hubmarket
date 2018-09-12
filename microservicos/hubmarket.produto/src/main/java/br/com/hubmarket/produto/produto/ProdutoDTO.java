package br.com.hubmarket.produto.produto;

import java.math.BigDecimal;
import java.util.List;

import br.com.hubmarket.produto.categoria.CategoriaDTO;
import br.com.hubmarket.produto.fornecedor.FornecedorDTO;
import br.com.hubmarket.produto.produtofornecedor.ProdutoFornecedorDTO;


public class ProdutoDTO {
	
	private Long id;
	private String codigo;	
	private String descricao;
	private CategoriaDTO categoria;
	private List<ProdutoFornecedorDTO> produtoFornecedor;
	private Integer classificacao;
	private BigDecimal menorPreco;
		
	
	public ProdutoDTO() {
		
	}
	
	public ProdutoDTO(Long id, String codigo, String descricao, Integer classificacao, BigDecimal menorPreco) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
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

	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}

		
	public List<ProdutoFornecedorDTO> getProdutoFornecedor() {
		return produtoFornecedor;
	}

	public void setProdutoFornecedor(List<ProdutoFornecedorDTO> produtoFornecedor) {
		this.produtoFornecedor = produtoFornecedor;
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

}
