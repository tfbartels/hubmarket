package br.com.hubmarket.mockFornecedores.fretePrazoEntrega;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/freteprazoentrega")
public class MockFretePrazoEntregaController {
	
	@GetMapping("/maxeletro/{cep}")
	public FretePrazoEntrega calcularFretePrazoEntregaMaxEletro(@PathVariable String cep) {
		
		Random gerador = new Random();
		FretePrazoEntrega fretePrazoEntrega =  new FretePrazoEntrega();
		
		fretePrazoEntrega.setValorFrete(new BigDecimal(gerador.nextDouble()*100).setScale(2, RoundingMode.HALF_UP));
		fretePrazoEntrega.setPrazoEntrega(gerador.nextInt(31) +" dias");
		
		return fretePrazoEntrega;
	}
	
	@GetMapping("/teceletro/{cep}")
	public FretePrazoEntrega calcularFretePrazoEntregaTecEletro(@PathVariable String cep) {
		
		Random gerador = new Random();
		FretePrazoEntrega fretePrazoEntrega =  new FretePrazoEntrega();
		
		fretePrazoEntrega.setValorFrete(new BigDecimal(gerador.nextDouble()*100).setScale(2, RoundingMode.HALF_UP));
		fretePrazoEntrega.setPrazoEntrega(gerador.nextInt(31) +" dias");
		
		return fretePrazoEntrega;
	}
	
	@GetMapping("/flyeletro/{cep}")
	public FretePrazoEntrega calcularFretePrazoEntregaFlyEletro(@PathVariable String cep) {
		
		Random gerador = new Random();
		FretePrazoEntrega fretePrazoEntrega =  new FretePrazoEntrega();
		
		fretePrazoEntrega.setValorFrete(new BigDecimal(gerador.nextDouble()*100).setScale(2, RoundingMode.HALF_UP));
		fretePrazoEntrega.setPrazoEntrega(gerador.nextInt(31) +" dias");
		
		return fretePrazoEntrega;
	}
	
	@GetMapping("/alfaeletro/{cep}")
	public FretePrazoEntrega calcularFretePrazoEntregaAlfaEletro(@PathVariable String cep) {
		
		Random gerador = new Random();
		FretePrazoEntrega fretePrazoEntrega =  new FretePrazoEntrega();
		
		fretePrazoEntrega.setValorFrete(new BigDecimal(gerador.nextDouble()*100).setScale(2, RoundingMode.HALF_UP));
		fretePrazoEntrega.setPrazoEntrega(gerador.nextInt(31) +" dias");
		
		return fretePrazoEntrega;
	}

}
