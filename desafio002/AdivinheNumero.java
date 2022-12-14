import java.util.Scanner;

public class AdivinheNumero {
    public static void main(String[] args) {
        while (true) {
            int numeroSecreto = 3;
            System.out.println("Qual o número secreto?");
            Scanner numUser = new Scanner(System.in);  // Create a Scanner object
            int numCompara = numUser.nextInt();


            if (numCompara == numeroSecreto) {
                System.out.println("correto!!!");
            } else {
                System.out.println("errou feio.");
            }
        }
    }
}