package br.com.hubmarket.produto.avaliacao;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.hubmarket.produto.produto.ProdutoDTO;

@JsonInclude(Include.NON_NULL)
public class AvaliacaoDTO {
	
	private Long id;
	
	private Integer classificacao;

	private String descricao;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date dataCriacao;
	
	private ProdutoDTO produto;
			
   
	public AvaliacaoDTO(Long id, Integer classificacao, String descricao, Date dataCriacao) {	
		this.id = id;
		this.classificacao = classificacao;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getClassificacao() {
		return classificacao;
	}
	
	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Date getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public ProdutoDTO getProduto() {
		return produto;
	}


	public void setProduto(ProdutoDTO produto) {
		this.produto = produto;
	}
		

}
