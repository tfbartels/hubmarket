package br.com.hubmarket.produto.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.hubmarket.produto.categoria.CategoriaEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>{
	
	public List<ProdutoEntity> findByCategoria(CategoriaEntity categoria);
	
	public List<ProdutoEntity> findByDescricaoContaining(String descricao);
	
	

}
