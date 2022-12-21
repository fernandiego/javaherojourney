import java.io.FileInputStream;
import java.util.Scanner;

public class Letras {

  public static void main(String ...args) throws Exception {

    String arquivo = args[0];
    int letras = 0;

    Scanner input  = new Scanner(new FileInputStream(arquivo));
    String texto = input.useDelimiter("\\A").next();
    texto = texto.replaceAll("\\d","").replaceAll("\\W","");
    letras = texto.length();

    System.out.printf("O arquivo %s tem %d letras\n", arquivo, letras);
  }
}