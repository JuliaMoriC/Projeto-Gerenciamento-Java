# Projeto API — Veículos e Serviços

API REST feita com Java 17, Spring Boot, Spring Data JPA e banco H2 em memória.

## Executar
1. Instale JDK 17+ e Maven.
2. No terminal, entre nesta pasta e execute `mvn spring-boot:run`.
3. Swagger: http://localhost:8081/swagger-ui/index.html
4. H2 Console: http://localhost:8081/h2-console (JDBC URL: `jdbc:h2:mem:apidb`, usuário `sa`, senha vazia).

## Endpoints
- `GET/POST /api/veiculos`
- `GET/PUT/DELETE /api/veiculos/{id}`
- `GET/POST /api/servicos`
- `GET/PUT/DELETE /api/servicos/{id}`

Exemplo de JSON para veículo: `{"placa":"ABC1D23","modelo":"Onix","marca":"Chevrolet","anoModelo":2024,"anoFabricacao":2023,"cor":"Prata","preco":85000}`

Exemplo de JSON para serviço: `{"descricao":"Troca de óleo"}`

O banco é em memória; os dados são reiniciados ao encerrar a aplicação.
