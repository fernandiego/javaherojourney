import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class CalculaRendimento {
    public static void main(String[] args) {
        System.out.println("lets go, desafio 06");

        InputStream inputstream;
        try {
            inputstream = new FileInputStream(args[0]);
            Scanner rendimentoDados = new Scanner(inputstream);
            System.out.println("Em 12 meses: ");
            System.out.println();
            while(rendimentoDados.hasNext()) {
                try{

                    String linha = rendimentoDados.nextLine();
//                System.out.println(linha);
                    List<String> lista = new ArrayList(Arrays.asList(linha.split(",")));
//                System.out.println(lista.get(0)+" haha");

                    switch (lista.get(1)){
                        case "CDB1":
                            double valorParaInvestir1 = Double.parseDouble(lista.get(2));
                            double rendimentoCDB1 = valorParaInvestir1*(Math.pow(1+0.01,12));
                            System.out.println(lista.get(0)+" terá: R$"+rendimentoCDB1);

                            break;

                        case "CDB2":
                            double valorParaInvestir2 = Double.parseDouble(lista.get(2));
                            double rendimentoCDB2 = valorParaInvestir2*(Math.pow(1+0.02,12));
                            System.out.println(lista.get(0)+" terá: R$"+rendimentoCDB2);

                            break;

                        case "CDB3":
                            double valorParaInvestir3 = Double.parseDouble(lista.get(2));
                            double rendimentoCDB3 = valorParaInvestir3*(Math.pow(1+0.03,12));
                            System.out.println(lista.get(0)+" terá: R$"+rendimentoCDB3);

                            break;
                    }
                } catch (Exception err){
//                    System.out.print("");
                }
            }
//            A fórmula para calcular os juros compostos é: M = C.(1-i)^n, sendo M o montante, C o capital inicial, i a taxa de juros e n o tempo.
//            System.out.println(lista.get(0)+" haha");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}