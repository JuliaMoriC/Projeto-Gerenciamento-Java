# Projeto Web — Funcionários e Contas do Mês

Aplicação web Java 17 com Spring Boot, Thymeleaf, Spring Data JPA e H2. Permite cadastrar/listar/excluir funcionários e contas do mês.

## Executar
1. Instale JDK 17+ e Maven.
2. Entre nesta pasta e execute `mvn spring-boot:run`.
3. Acesse http://localhost:8080
4. Console H2: http://localhost:8080/h2-console (JDBC URL `jdbc:h2:mem:webdb`, usuário `sa`, senha vazia).

O banco é em memória e reinicia quando a aplicação é encerrada. O protótipo implementa as operações principais de cadastro, consulta e exclusão; atualização pode ser adicionada como evolução.
