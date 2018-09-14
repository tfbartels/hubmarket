package br.com.hubmarket.produto.avaliacao;

import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hubmarket.produto.produto.ProdutoEntity;

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoEntity, Long>{
	
	List<AvaliacaoEntity> findByProduto(ProdutoEntity produto);
	
	List<AvaliacaoEntity> findAllByDataCriacaoBetween(Date dtInicio, Date dataFim);
	

}
