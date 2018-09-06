package br.com.hubmarket.produto.categoria;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "categoria")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class CategoriaEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2633898729150469473L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
		
	@NotNull
	@Column(name = "descricao", length = 500, nullable = false)
	private String descricao;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria_superior", referencedColumnName = "id", updatable = false, insertable = false)
	//@OneToOne
	//@JoinColumn(name="id_categoria_superior")
	//@JsonBackReference
	private CategoriaEntity categoriaSuperior;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_categoria_superior", referencedColumnName = "id", updatable = false, insertable = false)
	//@OneToMany(mappedBy="categoriaSuperior", cascade = CascadeType.ALL)
	//@JsonManagedReference
    private List<CategoriaEntity> listaCategoriasInferiores;

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

	public CategoriaEntity getCategoriaSuperior() {
		return categoriaSuperior;
	}

	public void setCategoriaSuperior(CategoriaEntity categoriaSuperior) {
		this.categoriaSuperior = categoriaSuperior;
	}	

	public List<CategoriaEntity> getListaCategoriasInferiores() {
		return listaCategoriasInferiores;
	}

	public void setListaCategoriasInferiores(List<CategoriaEntity> listaCategoriasInferiores) {
		this.listaCategoriasInferiores = listaCategoriasInferiores;
	}
	
	
	 
}
