package br.com.hubmarket.produto.avaliacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.hubmarket.produto.produto.ProdutoEntity;

@Entity
@Table(name = "avaliacao")
public class AvaliacaoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4857065241010750726L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Column(name = "classificacao", length = 5, nullable = false)
	private Integer classificacao;

	@NotNull
	@Column(name = "descricao", length = 500, nullable = false)
	private String descricao;

	@Column(name = "data_criacao")
	private Date dataCriacao;

	@ManyToOne()
	@JoinColumn(name = "id_produto")
	private ProdutoEntity produto;

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

	public ProdutoEntity getProduto() {
		return produto;
	}

	public void setProduto(ProdutoEntity produto) {
		this.produto = produto;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
