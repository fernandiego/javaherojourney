# Desafio 007

Lista de agentes secretos

## O que é?

Um programa que lê uma lista de passageiros e separa duas listas de possíveis
espiões.

Sabemos que os espiões americanos tem nome e sobrenome começando com letras
iguais (exemplo Mark Miller, David Diver, Laura Lane).

A partir da lista de passageiros, salvar uma nova lista contendo os possíveis
espiões.

## O que faz?

O arquivo `passageiros.txt` contém nomes e destinos. cada linha é um par
nome,destino. dá pra usar um `java.util.Scanner` combinado com um
`java.io.FileInputStream`.

Se da linha lida, o passageiro tiver o nome e sobrenome começando com a mesma
letra, ele é um possível espião e o nome dele deve ser salvo no arquivo
`suspeitos.txt`. No arquivo deve ter um suspeito por linha.

Pra escrever no arquivo pode usar `java.io.PrintWriter`, pois vamos escrever
apenas texto, nada de arquivos binários.

## Como compila?

```bash
javac Agentes.java
```

## Como executa?

```bash
# chama o programa passando o nome do arquivo
java Agentes passageiros.txt
# o programa escreve o arquivo suspeitos.txt
# opcionalmente, imprime uma mensagem dando o total de suspeitos
Enconrei 3 suspeitos
```

O arquivo de passageiros tem a seguinte forma:

```csv
Mirian Mel,Caucaia - Goiânia
Claudio Júlio,Crato - Juazeiro
Judas Justino,Fortaleza - Pacajus
Leonardo Silveira,Fortaleza - Rio de Janeiro
```

O arquivo de suspeitos tem apenas o nome dos suspeitos:

```csv
Mirian Mel
Judas Justino
```
