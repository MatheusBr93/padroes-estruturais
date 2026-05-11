
## Execução

Pela raiz do projeto multi-módulo:

```bash
mvn -pl mediator-project compile exec:java -Dexec.mainClass=mediator.app.Main
```

Ou dentro da pasta do módulo:

```bash
mvn compile exec:java -Dexec.mainClass=mediator.app.Main
```
