--Fornecedor
INSERT INTO public.usuario(id, email, nome)
	VALUES (1, 'contato@maxeletro.com', 'Max Eletro');
	
INSERT INTO public.fornecedor(cnpf, razao_social, id, url_servico_frete_prazo_entrega)
	VALUES ('67043082000122', 'Max Eletro Ltda', 1, 'http://localhost:8085/freteprazoentrega/maxeletro/{cep}');

INSERT INTO public.usuario(id, email, nome)
	VALUES (2, 'contato@teceletro.com', 'Tec Eletro');
	
INSERT INTO public.fornecedor(cnpf, razao_social, id, url_servico_frete_prazo_entrega)
	VALUES ('82888138000133', 'Tec Eletro Ltda', 2 , 'http://localhost:8085/freteprazoentrega/teceletro/{cep}');
	
INSERT INTO public.usuario(id, email, nome)
	VALUES (3, 'contato@flyeletro.com', 'Fly Eletro');
	
INSERT INTO public.fornecedor(cnpf, razao_social, id, url_servico_frete_prazo_entrega)
	VALUES ('96211818000122', 'Fly Eletro Ltda', 3, 'http://localhost:8085/freteprazoentrega/flyeletro/{cep}');	

INSERT INTO public.usuario(id, email, nome)
	VALUES (4, 'contato@alfaeletro.com', 'Alfa Eletro');
	
INSERT INTO public.fornecedor(cnpf, razao_social, id, url_servico_frete_prazo_entrega)
	VALUES ('86343979000116', 'Alfa Eletro Ltda', 4, 'http://localhost:8085/freteprazoentrega/alfaeletro/{cep}');	
	