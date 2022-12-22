import java.io.FileInputStream;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;



public class Letras {

  public static void main(String... args) throws Exception {


    InputStream inputstream;
    int letras = 0;

      inputstream = new FileInputStream(args[0]);
      Scanner lerArquivo = new Scanner(inputstream);
      System.out.println();

      while (lerArquivo.hasNext()) {

        String x = lerArquivo.next();
        String letrasLinha = x.replaceAll("\\d","");
        letras = letras + letrasLinha.length();
//        letras++;


//        System.out.printf("O arquivo %s tem %d letras\n", lerArquivo, letras);
//        System.out.printf("O conteúdo de x: "+x);
      }
    System.out.println("O arquivo contém  "+letras+" letras no total");
  }
}