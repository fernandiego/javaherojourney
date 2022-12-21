import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Agentes {
    public static void main(String[] args) {

        System.out.println("lets go, desafio 06");

        InputStream inputstream;
        try {
            inputstream = new FileInputStream(args[0]);
            Scanner agenteDados = new Scanner(inputstream);
            System.out.println();

//            String listaSuspeitos[];
            List<String> listaSuspeitos = new ArrayList<>();
            while (agenteDados.hasNext()) {
                try {
//
                    String linha = agenteDados.nextLine();
                    System.out.println(linha);
                    List<String> lista = new ArrayList(Arrays.asList(linha.split(",")));
//                    List<String> listaNomes = lista.split(" ");
//                    System.out.println(listaNomes.get(0)+ " primeiro nome");
//                    System.out.println(lista.get(0)+" haha");
                    String nome = lista.get(0);
                    String nomes[] = nome.split(" ");
//                    System.out.println(nome+" haha");
//                    System.out.println(nomes[0]+" hehe primeiro nome");
//                    System.out.println(nomes[1]+" hehe segundo nome");
                    String nomesLetras1[] = nomes[0].split("");
//                    System.out.println(nomesLetras1[0]+" primeira letra do primeiro nome");
                    String nomesLetras2[] = nomes[1].split("");
//                    System.out.println(nomesLetras2[0]+" primeira letra do segundo nome");
                    if(nomesLetras1[0].equals(nomesLetras2[0])){
                        System.out.println(nomes[0]+" É suspeito");
                        listaSuspeitos.add(nome);
                    }else {
                        System.out.println(nomes[0]+" Não é suspeito");
                    }

                } catch (Exception err) {
                    System.out.print("");
                }
            }
            System.out.println();
            System.out.println("Lista de suspeitos "+listaSuspeitos);

            FileWriter fileWriter = new FileWriter("passageirosSuspeitos.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < listaSuspeitos.size() ; i++) {
            printWriter.println(listaSuspeitos.get(i));

            }

            printWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}