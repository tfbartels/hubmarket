package br.com.hubmarket.produto.avaliacao;

public class AvaliacaoDTO {
	
	private Long id;
	private Integer classificacao;
	private String descricao;
	
		
	public AvaliacaoDTO(Long id, Integer classificacao, String descricao) {	
		this.id = id;
		this.classificacao = classificacao;
		this.descricao = descricao;
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
	
	
	

}
