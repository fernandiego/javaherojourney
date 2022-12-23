# Desafio 009

Lista de tarefas

## O que é?

Aplicação de linha de comando pra gestão de tarefas.

## O que faz?

Mantém uma lista de tarefas salva em um arquivo.

Via prompt interativo (`java.util.Scaner`) interage com o usuário para:

- listar tarefas
- adicionar tarefas
- remover tarefas
- marcar tarefa como concluída

As tarefas dvem ficar salvas num arquivo chamado `tarefas.txt`

## Como compila?

```bash
javac TodoList.java
```

## Como funciona?

```bash
# chama o programa
java TodoList

# o programa lê as tarefas do tarefas.txt e mostra as tarefas e um menu:
1 - estudar java,false
2 - jogar dota,true
3 - jantar,false

a - Adicionar
b - Concluir
c - Remover
d - Sair

O que você deseja fazer?

# o usuário escolhe uma opção e dá enter:
a

# o programa pergunta a tarefa

Digite a tarefa pra incluir:

# o usuário digita e dá enter:
Cortar o cabelo

# o programa volta a imprimir as tarefas e um menu

1 - estudar java:false
2 - jogar dota:true
3 - jantar:false
4 - Cortar o cabelo:false

a - Adicionar
b - Concluir
c - Remover
d - Sair

O que você deseja fazer?

# o usuário escolhe uma opção e dá enter:
b

# o programa pergunta qual tarefa:
Digite o número da tarefa para concluir:
3

# o programa conclui a tarefa e volta pra lista e menu

1 - estudar java:false
2 - jogar dota:true
3 - jantar:true
4 - Cortar o cabelo:false

a - Adicionar
b - Concluir
c - Remover
d - Sair

O que você deseja fazer?

# o usuário escolhe sair
d

# o programa grava as tarefas no arquivo e encerra
gravando as tarefas no tarefas.txt
```

## Orientações

- Tem uma classe chamada `Tarefa`, ela pode ajudar
- Use funções pra criar as operações que o menu mostra
- Use um Scanner pras operações de menu e outro pra ler e gravar o arquivo
- Use ArrayList pras tarefas enquanto o programa estiver rodando, não leia/grave
  tarefas a cada operação, apenas na abertura e fechamento do programa
