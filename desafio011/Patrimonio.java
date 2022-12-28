import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;


public class Patrimonio {

    private Scanner input = new Scanner(System.in);
    private List<Pessoa> pessoas = new ArrayList<>();
    private List<Pessoa> imoveis = new ArrayList<>();
    private List<Pessoa> veiculos = new ArrayList<>();

    public void carregaArquivos() throws Exception {}
    public void menu() throws Exception {}
    public void salvarArquivos() throws Exception {}

    // TODO completar os métodos acima

    // TODO criar os métodos pra listar as coisas

    // TODO criar os métodos pra criar as coisas

    // TODO criar os métodos pra editar as coisas

    // TODO criar os métodos pra excluir as coisas


    public static void main(String ...args) throws Exception {
        Patrimonio p = new Patrimonio();
        p.carregaArquivos();
        p.menu();
        p.salvarArquivos();
    }
}