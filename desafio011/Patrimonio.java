import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;


public class Patrimonio {

    private Scanner input = new Scanner(System.in);
    private List<Pessoa> pessoas = new ArrayList<>();
    private List<Imovel> imoveis = new ArrayList<>();
    private List<Veiculo> veiculos = new ArrayList<>();

    public void carregaArquivos() throws Exception {

        //Imóveis
        File fileI = new File("imoveis.txt");
        if (!fileI.exists()) {
            fileI.createNewFile();
        }
        Scanner loaderI = new Scanner(fileI);
        while (loaderI.hasNext()) {
            imoveis.add(Imovel.fromLine(loaderI.nextLine()));
        }
        loaderI.close();

        //Veículo
        File fileV = new File("veiculos.txt");
        if (!fileV.exists()) {
            fileV.createNewFile();
        }
        Scanner loaderV = new Scanner(fileV);
        while (loaderV.hasNext()) {
            veiculos.add(Veiculo.fromLine(loaderV.nextLine()));
        }
        loaderV.close();

        //Pessoa
        File fileP = new File("pessoas.txt");
        if (!fileP.exists()) {
            fileP.createNewFile();
        }
        Scanner loaderP = new Scanner(fileP);
        while (loaderP.hasNext()) {
            pessoas.add(Pessoa.fromLine(loaderP.nextLine()));
        }
        loaderP.close();

    }

    public void menu() throws Exception {
        String op = null;
        while (!"f".equals(op)) {
            System.out.println("O que deseja?");
            System.out.println();
            System.out.println("1) listar pessoas");
            System.out.println("2) adicionar pessoas");
            System.out.println("3) editar pessoas");
            System.out.println("4) remover pessoas");
            System.out.println("5) listar imóveis");
            System.out.println("6) adicionar imóveis");
            System.out.println("7) editar imóveis");
            System.out.println("8) remover imóveis");
            System.out.println("9) listar veículos");
            System.out.println("10) adicionar veículos");
            System.out.println("11) editar veículos");
            System.out.println("12) remover veículos");
            System.out.println("13) Sair");
            op = input.nextLine();

            switch (op) {
                case "1":
                    listaPessoa();
                    break;
                case "2":
                    addPessoa();
                    break;
                case "3":
                    editaPessoa();
                    break;
                case "4":
                    removePessoa();
                    break;
                case "5":
                    listaImovel();
                    break;
                case "6":
                    addImovel();
                    break;
                case "7":
                    editaImovel();
                    break;
                case "8":
                    removeImovel();
                    break;
                case "9":
                    listaVeiculo();
                    break;
                case "10":
                    addVeiculo();
                    break;
                case "11":
                    editaVeiculo();
                    break;
                case "12":
                    removeVeiculo();
                    break;
                case "13":
                    salva();
                    break;
            }
        }
    }

    public void salvarArquivos() throws Exception {
    }

    // TODO completar os métodos acima

    // TODO criar os métodos pra listar as coisas

    // TODO criar os métodos pra criar as coisas

    // TODO criar os métodos pra editar as coisas

    // TODO criar os métodos pra excluir as coisas


    public static void main(String... args) throws Exception {
        Patrimonio p = new Patrimonio();
        p.carregaArquivos();
        p.menu();
        p.salvarArquivos();
    }

    public void listaPessoa() {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(i + 1 + ") " + pessoas.get(i));
        }
    }

    public void listaImovel() {
        for (int i = 0; i < imoveis.size(); i++) {
            System.out.println(i + 1 + ") " + imoveis.get(i));
        }
    }

    public void listaVeiculo() {
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println(i + 1 + ") " + veiculos.get(i));
        }
    }

    public void addPessoa() {
        System.out.println("adiciona pessoa");
        System.out.println("Nome da pessoa");
        String nomePessoa = input.nextLine();
        System.out.println("Documento da pessoa");
        String documentoPessoa = input.nextLine();
        Pessoa p = new Pessoa(documentoPessoa, nomePessoa);
        pessoas.add(p);

    }

    public void addImovel() {
        System.out.println("adiciona Imovel");
        System.out.println("Documento do dono do imóvel");
        String documentoImovel = input.nextLine();
        System.out.println("Endereço do imóvel");
        String enderecoImovel = input.nextLine();
        System.out.println("Valor do imóvel");
        String valorImovel = input.nextLine();
        Imovel i = new Imovel(documentoImovel, enderecoImovel, valorImovel);
        imoveis.add(i);
    }

    public void addVeiculo() {
        System.out.println("adiciona Veículo");
        System.out.println("Documento do dono do veículo");
        String documentoVeiculo = input.nextLine();
        System.out.println("Qual o veículo");
        String descricaoVeiculo = input.nextLine();
        System.out.println("Valor do veículo");
        String valorVeiculo = input.nextLine();
        Veiculo v = new Veiculo(documentoVeiculo, descricaoVeiculo, valorVeiculo);
        veiculos.add(v);

    }
    public void removePessoa() {
        System.out.println("Digite o número do menu da pessoa que você gostaria de remover");
        listaPessoa();
        int rmPessoa = input.nextInt();
        pessoas.remove(rmPessoa-1);

    }
    public void removeImovel() {
        System.out.println("Digite o número do menu do imóvel que você gostaria de remover");
        listaImovel();
        int rmImovel = input.nextInt();
        imoveis.remove(rmImovel-1);
    }
    public void removeVeiculo() {
        System.out.println("Digite o número do menu do veículo que você gostaria de remover");
        listaVeiculo();
        int rmVeiculo = input.nextInt();
        veiculos.remove(rmVeiculo-1);
    }
    public void editaPessoa() {
        listaPessoa();
        System.out.println("Digite o número da pessoa que gostaria de editar");
        int editPessoa = Integer.parseInt(input.nextLine());
        System.out.println("Novo nome da pessoa");
        String novoNomePessoa = input.nextLine();
        System.out.println("Novo Documento da pessoa");
        String novoDocumentoPessoa = input.nextLine();
        Pessoa pessoaNova = pessoas.get(editPessoa-1);
        pessoaNova.update(novoDocumentoPessoa,novoNomePessoa);
    }
    public void editaImovel() {
        listaImovel();
        System.out.println("Digite o número do Imóvel que gostaria de editar");
        int editImovel = Integer.parseInt(input.nextLine());
        System.out.println("Documento do novo dono do Imóvel");
        String novoDocumentoImovel = input.nextLine();
        Imovel imovelNovoDono = imoveis.get(editImovel-1);
        imovelNovoDono.update(novoDocumentoImovel);
    }
    public void editaVeiculo() {
        listaVeiculo();
        System.out.println("Digite o número do Veículo que gostaria de editar");
        int editVeiculo = Integer.parseInt(input.nextLine());
        System.out.println("Documento do novo dono do Veículo");
        String novoDocumentoVeiculo = input.nextLine();
        Veiculo veiculoNovoDono = veiculos.get(editVeiculo-1);
        veiculoNovoDono.update(novoDocumentoVeiculo);
    }

    private void salva() throws Exception {
        PrintWriter writerPessoa = new PrintWriter("pessoas.txt");
        pessoas.forEach(writerPessoa::println);
        writerPessoa.flush();

        PrintWriter writerVeiculo = new PrintWriter("veiculos.txt");
        veiculos.forEach(writerPessoa::println);
        writerVeiculo.flush();

        PrintWriter writerImovel = new PrintWriter("imoveis.txt");
        imoveis.forEach(writerPessoa::println);
        writerImovel.flush();

        writerImovel.close();
        writerPessoa.close();
        writerVeiculo.close();
    }
}