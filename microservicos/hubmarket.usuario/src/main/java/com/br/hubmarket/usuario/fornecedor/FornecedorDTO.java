package com.br.hubmarket.usuario.fornecedor;


public class FornecedorDTO{
	
    private Long id;
	private String cnpf;	
	private String razaoSocial;

	
	public FornecedorDTO(Long id, String cnpf, String razaoSocial) {
		this.id = id;
		this.cnpf = cnpf;
		this.razaoSocial = razaoSocial;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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
	
	
	

}
