package br.com.hubmarket.produto.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

	@Autowired
	protected JpaRepository<CategoriaEntity, Long> categoriaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<CategoriaEntity> listar() {
		return this.categoriaRepository.findAll();
	}
}
