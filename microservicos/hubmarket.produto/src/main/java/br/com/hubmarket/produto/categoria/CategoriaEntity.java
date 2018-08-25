package br.com.hubmarket.produto.categoria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "categoria")
public class CategoriaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
		
	@NotNull
	@Column(name = "descricao", length = 500, nullable = false)
	private String descricao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_categoria_superior", referencedColumnName = "id", updatable = false, insertable = false)	
	private CategoriaEntity categoriaSuperior;

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

	public CategoriaDTO transformaEmDTO() {
	    return new CategoriaDTO(this.getId(), this.getDescricao());
	}
}
