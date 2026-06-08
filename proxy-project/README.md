# Projeto Proxy em Java

Implementação simples do padrão **Proxy**.

## Conceito

O padrão Proxy fornece um substituto ou representante para controlar o acesso a um objeto real.

## Exemplo usado

O projeto simula o acesso a documentos confidenciais.

- `Document` define a interface comum.
- `RealDocument` representa o documento real.
- `DocumentProxy` controla o acesso ao documento.
- Apenas usuários autorizados conseguem abrir o documento.

## Estrutura

- Subject: `Document`
- Real Subject: `RealDocument`
- Proxy: `DocumentProxy`
- Client: `Main`

## Execução

```bash
mvn -pl proxy-project compile exec:java -Dexec.mainClass=proxy.app.Main
```
