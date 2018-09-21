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
	
	@GetMapping("/pontofrio/{cep}")
	public FretePrazoEntrega calcularFretePrazoEntregaPontoFrio(@PathVariable String cep) {
		
		Random gerador = new Random();
		FretePrazoEntrega fretePrazoEntrega =  new FretePrazoEntrega();
		
		fretePrazoEntrega.setValorFrete(new BigDecimal(gerador.nextDouble()*100).setScale(2, RoundingMode.HALF_UP));
		fretePrazoEntrega.setPrazoEntrega(gerador.nextInt(31) +" dias");
		
		return fretePrazoEntrega;
	}
	
	@GetMapping("/casasbahia/{cep}")
	public FretePrazoEntrega calcularFretePrazoEntregaCasaBahia(@PathVariable String cep) {
		
		Random gerador = new Random();
		FretePrazoEntrega fretePrazoEntrega =  new FretePrazoEntrega();
		
		fretePrazoEntrega.setValorFrete(new BigDecimal(gerador.nextDouble()*100).setScale(2, RoundingMode.HALF_UP));
		fretePrazoEntrega.setPrazoEntrega(gerador.nextInt(31) +" dias");
		
		return fretePrazoEntrega;
	}
	
	@GetMapping("/magazineluiza/{cep}")
	public FretePrazoEntrega calcularFretePrazoEntregaMagazineLuiza(@PathVariable String cep) {
		
		Random gerador = new Random();
		FretePrazoEntrega fretePrazoEntrega =  new FretePrazoEntrega();
		
		fretePrazoEntrega.setValorFrete(new BigDecimal(gerador.nextDouble()*100).setScale(2, RoundingMode.HALF_UP));
		fretePrazoEntrega.setPrazoEntrega(gerador.nextInt(31) +" dias");
		
		return fretePrazoEntrega;
	}
	
	@GetMapping("/ricardoeletro/{cep}")
	public FretePrazoEntrega calcularFretePrazoEntregaRicardoEletro(@PathVariable String cep) {
		
		Random gerador = new Random();
		FretePrazoEntrega fretePrazoEntrega =  new FretePrazoEntrega();
		
		fretePrazoEntrega.setValorFrete(new BigDecimal(gerador.nextDouble()*100).setScale(2, RoundingMode.HALF_UP));
		fretePrazoEntrega.setPrazoEntrega(gerador.nextInt(31) +" dias");
		
		return fretePrazoEntrega;
	}

}
