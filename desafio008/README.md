# Desafio 008

Contador de letras

## O que é?

Passa um aquivo como argumento, daí o programa lê o conteúdo do arquivo e conta
as letras dentro dele.

Espaços vazios, quebras de linhas e caracteres especiais devem ser ignorados.

## O que faz?

Uma forma de fazer é ler o conteúdo completo do arquivo em uma única string e
então remover o que não for letra usando a função
[replace](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replaceAll(java.lang.String,%20java.lang.String)).
Essa função usa [regex](https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html)
pra capturar e substituir texto.

Exemplo:

```java
// ...
String letrasNumeros = "ab12cd34ef56";
String letras = letrasNumeros.replaceAll("\\d","");
String numeros = letrasNumeros.replaceAll("\\D","");
System.out.println(letras+numeros);
// imprime abcdef123456
```

## Como compila?

```bash
javac Letras.java
```

## Como funciona?

```bash
# executamos o programa passando o arquivo
java Letras exemplo.txt
# o programa exibe o resultado
O arquivo exemplo.txt tem 18 letras
```
