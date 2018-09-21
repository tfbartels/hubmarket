package br.com.hubmarket.mockFornecedores.fretePrazoEntrega;

import java.math.BigDecimal;

public class FretePrazoEntrega {
	
	private BigDecimal valorFrete;
	private String prazoEntrega;
	
	
	public BigDecimal getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}
	public String getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(String prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

}
