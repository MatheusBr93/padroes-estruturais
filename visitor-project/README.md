# Projeto Visitor em Java

Implementação simples do padrão **Visitor**.

## Conceito

O padrão Visitor permite adicionar novas operações a uma estrutura de objetos sem modificar suas classes.

## Exemplo usado

O projeto simula produtos de uma loja:
- Livro
- Eletrônico

O Visitor calcula descontos diferentes para cada tipo de produto.

## Estrutura

- Element: `Product`
- Concrete Elements:
  - `Book`
  - `Electronic`
- Visitor: `Visitor`
- Concrete Visitor: `DiscountVisitor`
- Client: `Main`

## Execução

```bash
mvn -pl visitor-project compile exec:java -Dexec.mainClass=visitor.app.Main
```
