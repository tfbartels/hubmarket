package com.br.hubmarket.usuario.fornecedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FornecedorRepository extends JpaRepository<FornecedorEntity, Long>{
	
	 @Query(value ="SELECT f.url_servico_frete_prazo_entrega FROM fornecedor f WHERE f.id = :idFornecedor", nativeQuery = true)
	 String buscaUrlServicoFretePrazoEntrega(@Param("idFornecedor") Long idFornecedor);

}
