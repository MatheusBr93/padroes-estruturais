# Projeto Facade em Java

Implementação simples do padrão **Facade**.

## Conceito

O padrão Facade fornece uma interface simplificada para um conjunto complexo de subsistemas.

## Exemplo usado

O projeto simula um sistema de Home Theater:

Subsistemas:
- DVD Player
- Projetor
- Sistema de Som

Facade:
- HomeTheaterFacade

## Estrutura

- Facade: `HomeTheaterFacade`
- Subsystems:
  - `DVDPlayer`
  - `Projector`
  - `SoundSystem`
- Client: `Main`

## Execução

```bash
mvn -pl facade-project compile exec:java -Dexec.mainClass=facade.app.Main
```
