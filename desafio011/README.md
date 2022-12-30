# Desafio 011

Gestão de patrimônio

## O que é?

Programa de gestão de bens de uma pessoa.

Uma pessoa pode possuir:

- imóveis
- veículos

O programa deve ser capaz de adicionar e remover dos registros qualquer um dos
patrimônios listados, bem como as próprias pessoas.

Por simplicidade, um elemento de patrimônio só pode ter um único dono.

## O que faz?

O programa mantém 3 arquivos:

- pessoas.txt
- imoveis.txt
- veiculos.txt

O programa deve **criar os arquivos** caso eles não existam.

O arquivo de pessoas guarda um documento e o nome da pessoa. Exemplo:

```csv
99750236300;LUIZ GONCALVES DA SILVA
73958603220;KENNY ABIORANA DURAN
02693018285;ELYTON GUSTAVO OLIVEIRA DINIZ
07998252200;WILACILAN DE SA DELGADO
22038400210;CATRINE DE BRITO FELIX
```

O arquivo de imoveis guarda o documento do dono e o logradouro. Exemplo:

```csv
99750236300;R. Carapinima, 2200 - Benfica, Fortaleza - CE, 60015-290;R$ 200 mil
73958603220;Av. Washington Soares, 3000 - Luciano Cavalcante, Fortaleza - CE, 60810-350;R$ 50 mil
02693018285;Av. Padre José Holanda do Vale, 600 - Luzardo Viana, Maracanaú - CE, 61912-010;R$ 1 milhão
07998252200;RUA OSCAR BARROSO ROCHA - SAPUPARA, Maranguape - CE, 61953-000;R$ 750 mil
73958603220;Rod. Brunilo Jacó de Castro e Silva - Matias, Pentecoste - CE, 62640-000;R$ 112 mil
```

O arquivo de veículos guarda o documento do dono e os dados do veículo. Exemplo:

```csv
99750236300;AUDI E-TRON ELÉTRICO SPORTBACK PERFORMANCE BLACK QUATTRO;R$ 200 mil
99750236300;BMW i3 REX FULL 8V ELÉTRICO 4P AUTOMÁTICO;R$ 200 mil
73958603220;VOLVO XC40 P6 RECHARGE ELECTRIC PLUS AWD;R$ 200 mil
07998252200;NISSAN LEAF B12P 40 ELÉTRICO;R$ 200 mil
22038400210;MINI COOPER SE TOP COLLECTION 2P ELÉTRICO;R$ 200 mil
```

Enquanto a lista de pessoas conta apenas com o documento e o nome, as outras
listas contam com documento, bem possuído e valor estimado.

É possível que a pessoa tenha nenhum bem.

É possível ter vários bens.

O programa deve ter um menu interativo oferecendo as seguintes opções:

- listar pessoas
- adicionar pessoas
- **editar pessoas
- remover pessoas
- listar imóveis
- adicionar imóveis
- editar imóveis
- remover imóveis
- listar veículos
- adicionar veículos
- editar veículos
- remover veículos**

Não é permitido adicionar ou remover veículos caso o número de documento não
exista na lista de pessoas.

Não é permitido adicionar ou remover imóveis caso o número de documento não
exista na lista de pessoas.

Não é possível editar o número de documento de uma pessoa.

Ao remover uma pessoa, remover também os bens dessa pessoa.

## Como compila?

```bash
# dentro da pasta do desafio:
javac *.java
```

## Como executa?

```bash
# dentro da pasta do desafio:
java Patrimonio
# mostra menus, opções, etc
```

## Dicas

- Veja os desafios anteriores.
- As classes estão mais incompletas desta vez, veja as dicas delas.
- As apis de lista e de stream serão muito úteis pra filtrar os dados.

Você pode filtrar listas de várias formas. Usando um laço:

```java
// ...
String documento = pessoa.getDocumento();
List<Veiculo> filtrados = new Arrayist<>();
for(Veiculo v : veiculos) {
    if(documento.equals(v.getDocumento())) {
        filtrados.add(v);    
    }   
}
```

Ou usando a api de streams:

```java
// ...
String documento = pessoa.getDocumento();
List<Veiculo> filtrados = veiculos.stream()
        .filter(v -> documento.equals(v.getDocumento()))
        .collect(Collectors.toList());
```
