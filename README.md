# Projeto java utilizando Spring Boot
API REST usando Spring Boot

## Pré-requisitos
* Java v11.0.9.1
* SpringBoot v2.4.3

## Visão da aplicação
Construir um sitema (API REST) de usuários e departmanetos

### Endpoint da aplicação;

* Inserir um novo usuário
* Buscar todos usuários
* Buscar um usuario pelo seu ID

### Como rodar 
* Entre na pasta UserDept.
* Rodar a classe UserdeptApplication.
* Acessando o http://localhost:8080/h2 e utilizando o login e senha que estão na pasta Resources, aquivo; application.properties.
* Rodar a ferramenta Postman para utilizar o EndPoints.
* Crie um past no Postman.
* Crie uma nova request, request do tipo GET, e utilizando o endereço http://localhost:8080/users e enviando a requisição no botão "Send" ira  visualizar todos os users cadrastrados no banco de dados.
* Crie uma nova request, request do tipo GET, e utilizando o endereço http://localhost:8080/users/ID, Utilizando o número(Id) a requisição retornara o usuario.
* Crie uma nova request, request do tipo POST, e utilizando o endereço http://localhost:8080/users, mude o Body(Corpo da requisição) para o formato "Raw" e de "Text" para "JSON" e utilizando o formato Json você consegue cadastrar um novo usuario no banco de dados.


### Teste unitário
* Junit

