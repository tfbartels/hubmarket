package br.com.hubmarket.produto.categoria;

public class CategoriaDTO {
	

	private Long id;
	private String descricao;
	private CategoriaDTO categoriaSuperior;
	
	public CategoriaDTO(Long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaDTO getCategoriaSuperior() {
		return categoriaSuperior;
	}

	public void setCategoriaSuperior(CategoriaDTO categoriaSuperior) {
		this.categoriaSuperior = categoriaSuperior;
	}	


}
