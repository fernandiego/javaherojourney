# Desafio 0004

pedra - tesoura - papel

## O que é?

Jogue pedra - tesoura - papel contra o computador

## O que faz?

O programa gera randomicamente uma jogada (pedra, tesoura ou papel), dá pra usar
o `int jogada = (int) (Math.random() * 10) % 3` ou qualquer outra coisa.

Em seguida, pergunta ao usuário "Qual sua jogada?" e espera a jogada. Por fim 
mostra uma mensagem dizendo quem venceu.

## Como compila?

```bash
# entre na pasta do desafio pelo terminal e
javac PedraTesouraPapel.java
```

## Como executa?

```bash
# Uma vez compilado, execute o programa:
java PedraTesouraPapel

# O programa vai perguntar:
Qual a sua jogada?

# Neste exemplo o programa escolheu jogar pedra, o usuário digitou papel e deu 
# enter:

papel

# O programa perdeu

Eu perdi!

# Terminou o programa
```
