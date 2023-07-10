# Primeiro código PostgreSQL no Java

Repositório referente a criação do primeiro código de PostgreSQL

O qual é responsável por realizar uma conexão com um banco de dados postgresql e consultar os dados do banco em questão.

## 📄 Dependência utilizada

Para utilizar o Postgres, foi necessário utilizar um projeto maven e dentro do arquivo pom.xml inserir a seguinte dependência:

```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
 </dependency>
```

## 🗂️ Base de dados criada

Para esse exemplo criei uma base de dados simples `turmacatalisa` , que contém apenas uma tabela `alunos` com as colunas `id` e `nome`.
A query para criar a tabela utlizada foi:
```
CREATE TABLE alunos (
    id INT PRIMARY KEY,
    nome VARCHAR(100)
);

INSERT INTO alunos (id, nome) VALUES (1, 'joão victor');
INSERT INTO alunos (id, nome) VALUES (2, 'iris');
INSERT INTO alunos (id, nome) VALUES (3, 'nicoly');
INSERT INTO alunos (id, nome) VALUES (4, 'ricardo');
```
