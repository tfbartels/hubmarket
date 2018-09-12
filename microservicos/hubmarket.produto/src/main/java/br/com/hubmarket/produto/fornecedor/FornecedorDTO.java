package br.com.hubmarket.produto.fornecedor;


public class FornecedorDTO{
	
    private Long id;
    private String nome;
	private String cnpf;	
	private String razaoSocial;

	
	public FornecedorDTO(Long id, String nome, String cnpf, String razaoSocial) {
		this.id = id;
		this.nome = nome;
		this.cnpf = cnpf;
		this.razaoSocial = razaoSocial;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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
