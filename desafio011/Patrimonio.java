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