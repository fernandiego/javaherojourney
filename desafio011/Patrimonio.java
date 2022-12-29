import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.ArrayList;


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
                    System.out.println("bleh");
                    break;
                case "2":
                    System.out.println("bleh");
                    break;
                case "3":
                    System.out.println("bleh");
                    break;
                case "4":
                    System.out.println("bleh");
                    break;
                case "5":
                    System.out.println("bleh");
                    break;
                case "6":
                    System.out.println("bleh");
                    break;
                case "7":
                    System.out.println("bleh");
                    break;
                case "8":
                    System.out.println("bleh");
                    break;
                case "9":
                    System.out.println("bleh");
                    break;
                case "10":
                    System.out.println("bleh");
                    break;
                case "11":
                    System.out.println("bleh");
                    break;
                case "12":
                    System.out.println("bleh");
                    break;
                case "13":
                    System.out.println("bleh");
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
}