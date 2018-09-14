package br.com.hubmarket.produto.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>{
			
	public List<ProdutoEntity> findByDescricaoContaining(String descricao);	

}
