import java.util.ArrayList;
import java.util.Scanner;
public class CampeonatoParOuImpar {
    public static void main(String[] args) {
        ArrayList<Integer> escolhasUsuario = new ArrayList<>();

        Scanner usuario = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println("Qual seu palpite "+i+"?");
            String numUsuario = usuario.nextLine();

            if (numUsuario.equals("par")){
                escolhasUsuario.add(0);
            }else {
                escolhasUsuario.add(1);
            }

        }

        System.out.println("Usuario escolheu esses números "+escolhasUsuario);

        int max = 5;
        int min = 1;
        int range = max - min + 1;

// generate random numbers within 1 to 5
        ArrayList<Integer> escolhasComputador = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
        int rand = (int)(Math.random() * range) + min;

// Output is different everytime this code is executed
        System.out.println(rand);
        escolhasComputador.add(rand);

}
        System.out.println(escolhasComputador);
    }
}