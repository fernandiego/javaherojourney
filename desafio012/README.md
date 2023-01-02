# Desafio 012

Simulador de ações da bolsa

## O que é?

Rode o simulador para produzir flutuações fictícias aleatórias em contratos de
mentira.

Configure o bot operador com o volume inicial de contratos, parâmetros de compra
e venda e confira o resultado ao final da simulação.

## O que faz?

A cada segundo o simulador gera valores para os papéis simulados. Daí o bot
decide se compra, vende ou nada faz. 

Ao final do período o bot apresenta o resultado.

Os papéis negociados e seus valores iniciais vem de um arquivo chamado `B3.csv`.

Exemplo:

```csv
PETR4;13
BEES4;5
DOL3F;5
MGLU4;2
AAPL4;100
VALE3;80
```

Ao comprar um papel o bot deve incrementar um contador de papeis interno. Ao
vender decrementa.

Compra e venda são feitas de acordo com o valor atual do papel.

Quantidade pra comprar ou pra vender é liberdade criativa, programe como achar
melhor.

## Como compila?

```bash
javac *.java
```

## Como executa?

```bash
# roda o simulador por 1 minuto, alimentando o bot com 500, orientando comprar
# PETR4 a 10 e vender por 20
java Bolsinha 1 500 PETR4 10 20
# imprime os resultados das operações
[PETR4;48, BEES4;18, DOL3F;103, MGLU4;122, AAPL4;96, VALE3;161]
Capital: 500
Papel: 0 PETR4
[PETR4;55, BEES4;17, DOL3F;109, MGLU4;117, AAPL4;84, VALE3;158]
Capital: 400
Papel: 7 PETR4
[PETR4;43, BEES4;27, DOL3F;122, MGLU4;110, AAPL4;77, VALE3;154]
Capital: 347
Papel: 11 PETR4
# ...
```

## Dicas

Para selecionar o papel certo, tanto pode fazer um laço e comparar o nome do
papel no bot com os nomes dos papéis na lista quanto usar a api de streams com
filter e findFirst https://www.baeldung.com/java-stream-findfirst-vs-findany
