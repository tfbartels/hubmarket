
--Categoria
INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (1, 'TVs', null);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (2, 'TV 32"', 1);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (3, 'TV 49"', 1);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (4, 'TV 55"', 1);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (5, 'Celulares', null);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (6, 'Moto G', 5);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (7, 'iPhone', 5);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (8, 'Zenfone', 5);
  
INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (9, 'Moveis', null);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (10, 'Mesa', 9);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (11, 'Cadeira', 9);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (12, 'Sofá', 9);
  
INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (13, 'Eletrodomésticos', null);
  
INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (14, 'Geladeira', 13);

INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (15, 'Fogão', 13);
  
INSERT INTO public.categoria(id, descricao, id_categoria_superior)
	VALUES (16, 'Lavadoura de Roupa', 13);
  

--Produto
INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco)
	VALUES (1, '000001', 'TV 49" LG', 3,  4, 2999.00);
	
INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco)
	VALUES (2, '000002', 'TV 32" LG', 2,  3, 3999.00);	
	
INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco)
	VALUES (3, '000003', 'TV 55" LG', 4,  5, 5000.00);

INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco)
	VALUES (4, '000004', 'TV 32" Samsung', 2,  4, 2998.00);	
	
INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco)
	VALUES (5, '000005', 'TV 49" Samsung', 3,  4, 4100.00);		

INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco)
	VALUES (6, '000006', 'TV 55" Samsung', 4,  4, 4990.00);	
	
	
--Produto Fornecedor
INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (1, 1, 5, 2700, 2970, 1);	

INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (2, 2, 2, 2750, 3025, 1);
	
INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (3, 3, 10, 3000, 3300, 1);
	
INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (4, 4, 7, 2800, 3080, 1);
		