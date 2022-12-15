# Desafio 003

Lista de tarefas - Treinar listas e Strings

## O que é e o que faz?

Programa pra organizar as tarefas do dia usando listas (*java.util.ArrayList*).
Ele recebe como argumento as tarefas a realizar separadas por vírgula, depois
imprime esta lista **numerada** de tarefas no terminal e pergunta: "qual tarefa
foi concluída?".

No prompt o usuário informa o número da tarefa para encerrar. A tarefa é
removida da lista e o programa imprime novamente a lista numerada. Não precisa
lembrar qual número saiu, pode numerar de acordo com o que sobrou na lista.

**Dica:** como a passagem de argumentos vai colocar vírgulas e palavras
separadas dentro do array de argumentos (String[] args), usar operações de
concatenação de string e depois de split pra capturar as tarefas.

## Como compila?

Na pasta do desafio compile o arquivo java:

```bash
javac ListaDeTarefas.java
```

## Como executa?

```bash
# chame o programa com as tarefas como argumento:
java ListaDeTarefas cortar cabelo, banho, levar o lixo pra fora

# o programa deve imprimir a lista de tarefas e perguntar qual foi concluída:
1. cortar cabelo
2. banho
3. levar o lixo pra fora

Qual tarefa foi concluída?

# o usuário informa um número:
1

# o programa imprime a lista novamente, sem a tarefa concluída
1. banho
2. levar o lixo pra fora

Qual tarefa foi concluída?

# o programa imprime a lista que restou e pergunta novamente. 
# o programa termina se não houverem mais tarefas.
```
