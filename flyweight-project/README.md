# Projeto Flyweight em Java

Implementação simples do padrão **Flyweight**.

## Conceito

O padrão Flyweight reduz o consumo de memória compartilhando objetos repetidos.

Ele separa:

- Estado intrínseco: dados compartilhados entre vários objetos.
- Estado extrínseco: dados específicos de cada uso.

## Exemplo usado

O projeto simula um sistema de árvores em um mapa.

- O tipo da árvore é compartilhado.
- A posição da árvore é individual.

## Estrutura

- Flyweight: `TreeType`
- Flyweight Factory: `TreeFactory`
- Context: `Tree`
- Client: `Main`

## Execução

```bash
mvn -pl flyweight-project compile exec:java -Dexec.mainClass=flyweight.app.Main
```
