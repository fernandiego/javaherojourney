# Desafio 006 - rendimentos

Calcular rendimentos de um ano dos valores que os clientes tem disponíveis

## O que é?

Um arquivo texto contém informações dos correntistas (nome, produto e saldo) e
precisamos saber qual o rendimento após 12 meses.

## O que faz?

O programa deve ler o arquivo texto fornecido, identificar correntista, produto,
saldo e fazer as contas de qual será o valor de saldo após 12 meses.

Cada linha do arquivo contém um registro de cliente. Cada registro tem nome,
produto e saldo, separados por vírgula.

Os produtos possíveis são:

- CDB1: rende 1% ao mês
- CDB2: rende 2% ao mês
- CDB3: rende 3% ao mês

O nome do arquivo a ser lido deve ser passado para o programa como argumento,
daí o programa pode ler as linhas do arquivo usando o `java.util.Scanner`
associado a um `java.io.FileInputStream`.

Para fins de simplicidade, basta usar a **fórmula de juros compostos** pra
descobrir o valor de cada cliente ao final de 12 meses.

## Como compila?

```bash
javac CalculaRendimento.java
```

## Como executa?

```bash
# primeiro chamamos o programa passando a lista de clientes
java CalculaRendimento lista-1-clientes.txt

# daí o programa imprime a resposta

Em 12 meses:

Maria terá R$ 112,69
Jonas terá R$ 96.39
Carlos terá R$ 641.60

# e acabou o programa
```

O conteúdo do arquivo _lista-1-clientes.txt_ é o seguinte:

```csv
Maria,CDB1,100
Jonas,CDB2,76
CarlosCDB3,450
```

A fórmula de Juros compostos faz, em 12 meses, 100 virar 112,69 pelo produto
CDB1, que rende 1%. 76 pelo produto CDB2, de 2%, vira 96.39. Por fim, 12 meses
de produto CDB3, que rende 3%, faz 450 virar 641.

Caso a linha esteja vazia, ignorar em vez de dar exceção. Use `try/catch` para
capturar os erros caso a linha do arquivo não seja válida.
