
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
INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco, url_imagem, detalhes)
	VALUES (1, '000001', 'TV 49" LG', 3,  4, 2999.00, 'statics/imagens/tvlg49.jpg','A TV LG 49 possui imagens realistas e tecnologias que você nunca viu. Com a plataforma Smart mais rápida do mercado, o WebOS 3.5 é muito mais intuitivo e conta com diversas funções novas, além de entregar uma melhor experiência para o consumidor. A função Quick Access permite acessar diversos recursos com um simples toque de botão do controle remoto. Outro diferencial do modelo LG 49 é a qualidade do painel IPS que oferece excelente qualidade de imagem para todos os seus conteúdos.');
	
INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco, url_imagem, detalhes)
	VALUES (2, '000002', 'TV 32" LG', 2,  3, 3999.00, 'statics/imagens/tvlg32.jpg','Com a TV LED 32 da LG você proporciona aos seus hóspedes o melhor em entretenimento. Especialmente para uso comercial, ela possui recursos como o USB Cloning, onde você copia os ajustes realizados na função Modo Hotel de uma TV para as outras de maneira simples e prática. Sua tela de 32" com resolução HD proporciona imagens nítidas e brilhantes!');	
	
INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco, url_imagem, detalhes)
	VALUES (3, '000003', 'TV 55" LG', 4,  5, 5000.00, 'statics/imagens/tvlg55.jpg', 'A TV LG 55 possui imagens realistas e tecnologias que você nunca viu. Com a plataforma Smart mais rápida do mercado, o WebOS 3.5 é muito mais intuitivo e conta com diversas funções novas, além de entregar uma melhor experiência para o consumidor. A função Quick Access permite acessar diversos recursos com um simples toque de botão do controle remoto.');

INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco, url_imagem, detalhes)
	VALUES (4, '000004', 'TV 32" Samsung', 2,  4, 2998.00,'statics/imagens/tvsamsung32.jpg', 'Desfrute de conteúdos exclusivos e divirta-se muito mais no dia a dia com a TV Samsung 32. Um aparelho moderno com plataforma smart para você navegar pela internet, assistir vídeos no Youtube, Netflix e explorar uma variedade de aplicativos disponíveis. E tudo isso com imagens em alta resolução para aproveitar cada detalhe.');	
	
INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco, url_imagem, detalhes)
	VALUES (5, '000005', 'TV 49" Samsung', 3,  4, 4100.00, 'statics/imagens/tvsamsung49.jpg', 'Uma experiência de entretenimento sob medida para você. A Samsung LED Smart TV 49J5200 conta com os recursos essenciais para uma Smart TV. Navegue pela Internet, assista os vídeos no Youtube, Netflix e explore uma variedade de aplicativos disponíveis. ');		

INSERT INTO public.produto(id, codigo, descricao, id_categoria,  classificacao, menor_preco, url_imagem, detalhes)
	VALUES (6, '000006', 'TV 55" Samsung', 4,  4, 4990.00, 'statics/imagens/tvsamsung55.jpg', 'Com a Smart TV Samsung 55MU6300 você tem acesso a diversos conteúdos e muito mais entretenimento. Assista seus programas favoritos com a resolução UHD 4K para imagens impressionantes com 4 vezes mais definição');	
	
	
--Produto Fornecedor
INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (1, 1, 5, 2700, 2970, 1);	

INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (2, 2, 2, 2750, 3025, 1);
	
INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (3, 3, 10, 3000, 3300, 1);
	
INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (4, 4, 7, 2800, 3080, 1);
	

INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (5, 1, 3, 2600, 2770, 2);	

INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (6, 2, 6, 2850, 3025, 2);
	
INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (7, 3, 10, 3000, 3300, 2);
	
INSERT INTO public.produto_fornecedor(id, id_fornecedor, quantidade, valor_compra, valor_venda, id_produto)
	VALUES (8, 4, 8, 2700, 3100, 2);	
	
	
--Avaliacoes
INSERT INTO public.avaliacao(id, classificacao, descricao, id_produto, data_criacao)
	VALUES (1, 5,'Ótimo produto, recomendado!', 1, '02/08/2018');
	
INSERT INTO public.avaliacao(id, classificacao, descricao, id_produto, data_criacao)
	VALUES (2, 3,'Boa nitidez de imagem, e muitas funcionalidades.', 1, '07/09/2018');	

INSERT INTO public.avaliacao(id, classificacao, descricao, id_produto, data_criacao)
	VALUES (3, 4,'TV muito boa. Indicado!', 2, '07/10/2018');	
		