# Projeto Iterator em Java

Implementação simples do padrão **Iterator**.

## Conceito

O padrão Iterator permite percorrer os elementos de uma coleção sem expor sua estrutura interna.

## Exemplo usado

O projeto simula uma coleção de livros em uma biblioteca.

A biblioteca guarda os livros internamente em uma lista, mas o cliente percorre os livros usando um iterator.

## Estrutura

- Model: `Book`
- Iterator: `BookIterator`
- Concrete Iterator: `LibraryBookIterator`
- Aggregate/Collection: `Library`
- Client: `Main`

## Execução

```bash
mvn -pl iterator-project compile exec:java -Dexec.mainClass=iterator.app.Main
```
