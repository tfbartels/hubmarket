# Hub Market - Microserviços

## Iniciando

API de microserviço do projeto Hub Market, responsável pelo back-end da aplicação. 

### Pré-requisitos

```
Maven
Java JDK - versão 1.8.0_181
```

### IDE para Desenvolvimento

Foi adotado o Eclipse para Java EE como IDE para o desenvolvimento. 
As demais instruções serão dadas baseada nesta ferramenta.

### Instalação

1. Realize a importação para o Eclipse dos projetos que estão dentro da pasta microservicos.
2. Após importados o Maven fará automaticamente a importação de todas as dependências necessárias.

### Execução

1. Selecione um projeto e com botão direito do mouse acesse a opção:
```
Run As > Maven Build
```

2. Em Run Configurations insira no campo Goals:
```
spring-boot:run
```

## Deploy

1. Selecione um projeto e com botão direito do mouse acesse a opção:
```
Run As > Maven Install
```

Será gerado um arquivo .jar, com servidor autocontido, que poderá ser executado através do prompt de comandos.


## Autores
* **Thiago de Freitas Bartels** - *Versão inicial* - [tfbartels](https://github.com/tfbartels)
