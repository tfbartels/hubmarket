package br.com.hubmarket.produto.produtofornecedor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hubmarket.produto.produto.ProdutoEntity;

public interface ProdutoFornecedorRepository extends JpaRepository<ProdutoFornecedorEntity, Long>{
	
	List<ProdutoFornecedorEntity> findByProduto(ProdutoEntity produto);
	

}
