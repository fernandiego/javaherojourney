import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaDeTarefas {
    public static void main(String[] args) {
        String listaPronta = "";
        for (int i = 0; i < args.length; i++) {
            listaPronta = listaPronta + args[i] + " ";
//            System.out.println(nome);
        }

        List <String> lista =  Arrays.asList(listaPronta.split(","));
//        String values = "book2s.com ,asdfa asdf ,asdf asdf, asdf asdf ";
//        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(i+1+". "+ lista.get(i));
        }
    }
}