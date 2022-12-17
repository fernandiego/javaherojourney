# Desafio 005

Campeonato par ou ímpar - treinar uso de função

## O que é?

Jogue par ou ímpar contra o programa

## O que faz?

Ao iniciar, o programa decide 5 valores, entre 1 e 5, para jogar contrao usuário.

O programa pergunta 5 vezes para o usuário: "É par ou é ímpar?"

Ao final, o computador revela seus cinco valores e diz a estatística de acerto
do usuário.

A parte que se repete pode ser feita com uma função reutilizável, assim evitamos
repetir código. 

É pra chamar uma função 5 vezes em vez de criar 5 blocos de pergunta e leitura 
de input.

## Como compila?

```bash
javac CampeonatoParOuImpar.java
```

## Como executa?

```bash
# Chame o programa java
java CampeonatoParOuImpar

# O programa pergunta
Qual seu palpite 1?

# O usuário informa
par

# O programa pergunta
Qual seu palpite 2?

# O usuário informa
impar

# O programa pergunta
Qual seu palpite 3?

# O usuário informa
impar

# O programa pergunta
Qual seu palpite 4?

# O usuário informa
impar

# O programa pergunta
Qual seu palpite 5?

# O usuário informa
par

# Por fim, o programa revela seus 5 números
Meus números eram [1,2,2,1,4]

# E informa se o usuário ganhou ou perdeu
Você responderu [par,impar,impar,impar,par]
O resultado de cada rodada foi [Errou,Errou,Errou,Acertou,Acertou]
Resultado final: Você perdeu!
```
