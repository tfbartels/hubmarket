package br.com.hubmarket.produto.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.hubmarket.produto.produto.ProdutoEntity;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	protected JpaRepository<ProdutoEntity, Long> produtoRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<ProdutoEntity> listar() {
		return this.produtoRepository.findAll();
	}
}
