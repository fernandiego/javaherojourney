import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ListaDeTarefas {
    public static void main(String[] args) {
        String listaPronta = "";
        for (int i = 0; i < args.length; i++) {
            listaPronta = listaPronta + args[i] + " ";
//            System.out.println(nome);
        }

        List<String> lista = new ArrayList(Arrays.asList(listaPronta.split(",")));
//        String values = "book2s.com ,asdfa asdf ,asdf asdf, asdf asdf ";
//        System.out.println(lista);

//        System.out.println(lista);
//        lista.remove(0);
        while (lista.size() > 0) {

            for (int i = 0; i < lista.size(); i++) {

                System.out.println(i + 1 + "." + lista.get(i).trim());
            }
            System.out.println("Qual tarefa você concluiu?");
            Scanner tarefaConcluida = new Scanner(System.in);  // Create a Scanner object

            int removerIndex = tarefaConcluida.nextInt();
            lista.remove(removerIndex - 1);

        }
//        System.out.println(lista);

//        for (int i = 0; i < lista.size(); i++) {
//
//            System.out.println(i + 1 + "." + lista.get(i).trim());
//        }

    }
}