package br.com.hubmarket.produto.produto;

import java.util.List;

import br.com.hubmarket.produto.categoria.CategoriaDTO;
import br.com.hubmarket.produto.fornecedor.FornecedorDTO;


public class ProdutoDTO {
	
	private Long id;
	private String codigo;	
	private String descricao;
	private CategoriaDTO categoria;
	private FornecedorDTO fornecedor;
	
	
	
	public ProdutoDTO(Long id, String codigo, String descricao, CategoriaDTO categoria) {
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.categoria = categoria;
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

	
	public FornecedorDTO getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(FornecedorDTO fornecedor) {
		this.fornecedor = fornecedor;
	}

	


	
	


	

	
}
