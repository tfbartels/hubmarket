package br.com.hubmarket.produto.produto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.hubmarket.produto.categoria.CategoriaEntity;
import br.com.hubmarket.produto.produtofornecedor.ProdutoFornecedorEntity;

@Entity
@Table(name = "produto")
public class ProdutoEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1546901139442671842L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="imagem")
	private byte[] imagem;
	
	@NotNull
	@Column(name = "codigo", length = 120, nullable = false)
	private String codigo;	
	
	@NotNull
	@Column(name = "descricao", length = 500, nullable = false)
	private String descricao;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private CategoriaEntity categoria;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "produto" , fetch = FetchType.LAZY)
	private List<ProdutoFornecedorEntity> produtoFornecedor; 
	
	@NotNull
	@Column(name = "classificacao", length = 5, nullable = false)
	private Integer classificacao;
	
	@NotNull
	@Column(name = "menor_preco",  nullable = false)
	private BigDecimal menorPreco;
	

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

		
	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
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

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}

	
	public List<ProdutoFornecedorEntity> getProdutoFornecedor() {
		return produtoFornecedor;
	}

	public void setProdutoFornecedor(List<ProdutoFornecedorEntity> produtoFornecedor) {
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
