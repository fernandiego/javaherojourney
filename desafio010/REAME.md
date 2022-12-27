# Desafio 010

Clínica de animais

## O que é?

Este programa ajuda a gerir uma clínica veterinária.

## O que faz?

Existe um índice de animais, eles podem estar curados ou em tratamento.

É possível adicionar animais.

Não é possível excluir animais.

Ao adicionar um animal, ele entra em tratamento.

É possível ainda saber quantas vezes um bicho entrou em tratamento.

É possível listar todos os animais, apenas os curados e apenas os em tratamento.

Naõ é possível marcar como em tratamento um animal que já esteja em tratamento.

Não é possível marcar como curado um animal já curado.

É possível ir de curado para em tratamento e de em tratamento para curado.

O índice de animais deve ser salvo num arquivo chamado `pet-clinic.txt`.

Exemplo de arquivo:

```csv
totó,em tratamento,1
maria calopsita,curado,1
gato félix,em tratamento,3
peixinho verde,curado,2
```

Atenção: o arquivo pode não existir.

Algumas classes serão fornecidas para ajudar na implementação, corrija os erros
de compilação.

## Como compila?

```bash
javac *.java
```

## Como executa?

```bash
# chamamos o programa
java Main
# imprime um menu
O que deseja?

a) ver todos os animais
b) ver curados
c) ver em tratamento
d) marcar como curado
e) marcar em tratamento
f) sair
# escolhe uma opção
b
# imprime os curados
1) maria calopsita, tratado 1 vez(es)
2) peixinho verde, tratado 2 vez(es)
# imprime um menu
O que deseja?

a) ver todos os animais
b) ver curados
c) ver em tratamento
d) marcar como curado
e) marcar em tratamento
f) sair
# escolhe uma opção
c
1) totó, tratado 1 vez(es)
2) gat félix, tratado 3 vez(es)
# imprime um menu
O que deseja?

a) ver todos os animais
b) ver curados
c) ver em tratamento
d) marcar como curado
e) marcar em tratamento
f) sair
# escolhe uma opção
e
# imprime os animais em tratamento e pergunta qual marcar
1) totó, tratado 1 vez(es)
2) gato félix, tratado 3 vez(es)

Qual deles marcar como curado?
# cura o 2
2
# volta para o menu
O que deseja?

a) ver todos os animais
b) ver curados
c) ver em tratamento
d) marcar como curado
e) marcar em tratamento
f) sair
# sai do programa
f
# fim
```
