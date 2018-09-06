package br.com.hubmarket.produto.categoria;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long>{
	
	List<CategoriaEntity> findByListaCategoriasInferioresIsNotEmpty();

}
