# Projeto Prototype em Java

Implementação simples do padrão **Prototype**.

## Conceito

O padrão Prototype permite criar novos objetos clonando instâncias existentes,
em vez de criar objetos do zero.

## Exemplo usado

O projeto simula personagens de um jogo.

Cada personagem pode ser clonado e modificado independentemente.

## Estrutura

- Prototype: `GameCharacter`
- Client: `Main`

## Execução

```bash
mvn -pl prototype-project compile exec:java -Dexec.mainClass=prototype.app.Main
```
