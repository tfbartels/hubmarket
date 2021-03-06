package com.br.hubmarket.usuario.fornecedor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.br.hubmarket.usuario.UsuarioEntity;


@Entity
@Table(name = "fornecedor")
@PrimaryKeyJoinColumn(name="id")
public class FornecedorEntity extends UsuarioEntity{
	
	@NotNull
	@Column(name = "cnpf", length = 14, nullable = false)
	private String cnpf;	
	

	@NotNull
	@Column(name = "razao_social", length = 120, nullable = false)
	private String razaoSocial;

	@Column(name = "url_servico_frete_prazo_entrega", length = 500, nullable = true)
	private String urlServicoFretePrazoEntrega;	
	
	
	public String getCnpf() {
		return cnpf;
	}


	public void setCnpf(String cnpf) {
		this.cnpf = cnpf;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getUrlServicoFretePrazoEntrega() {
		return urlServicoFretePrazoEntrega;
	}


	public void setUrlServicoFretePrazoEntrega(String urlServicoFretePrazoEntrega) {
		this.urlServicoFretePrazoEntrega = urlServicoFretePrazoEntrega;
	}


	

}
