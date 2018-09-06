package br.com.hubmarket.produto.categoria;

import java.util.List;

public class CategoriaDTO {
	

	private Long id;
	private String descricao;
	private List<CategoriaDTO> listaCategoriasInferiores;
	
	public CategoriaDTO(Long id, String descricao) {		
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

	public List<CategoriaDTO> getListaCategoriasInferiores() {
		return listaCategoriasInferiores;
	}

	public void setListaCategoriasInferiores(List<CategoriaDTO> listaCategoriasInferiores) {
		this.listaCategoriasInferiores = listaCategoriasInferiores;
	}

	


}
