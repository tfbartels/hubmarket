package br.com.hubmarket.produto.produtofornecedor;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.hubmarket.produto.fornecedor.FornecedorDTO;

@JsonInclude(Include.NON_NULL)
public class ProdutoFornecedorDTO {
	
	private Long id;

	private FornecedorDTO fornecedor;
	
	private Long quantidade;
		
	private BigDecimal valorVenda;
	    

	public ProdutoFornecedorDTO(Long id, FornecedorDTO fornecedor, Long quantidade, BigDecimal valorVenda) {
		super();
		this.id = id;
		this.fornecedor = fornecedor;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FornecedorDTO getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(FornecedorDTO fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}
		
	
	
}
