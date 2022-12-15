import java.util.Scanner;
public class PedraTesouraPapel {
    public static void main(String[] args) {

        Scanner numUser = new Scanner(System.in);  // Create a Scanner object

//        System.out.println(numCompara);
        while(true){
            System.out.println("Desafio Pedra, Papel, Tesoura. Escolha um e derrote o computador");
            System.out.println("Qual sua jogada? Escolha entre as opções digitando o número da mesma");
            System.out.println("1-Pedra\n2-Papel\n3-Tesoura");
            int numCompara = numUser.nextInt();

    int escolhaComputador = (int) (Math.random() * 10) % 3;
    escolhaComputador++;
    System.out.println("A escolha do computador foi: "+escolhaComputador);

    switch (numCompara) {

        case 1:
            if(escolhaComputador == 1){
                System.out.println("Empatou!");
            } else if (escolhaComputador == 2) {
                System.out.println("Você perdeu!");
            } else if (escolhaComputador == 3) {
                System.out.println("Você ganhou!");
            }
// bloco de código que será executado

            break;

        case 2:
            if(escolhaComputador == 1){
                System.out.println("Você ganhou!");
            } else if (escolhaComputador == 2) {
                System.out.println("Empatou!");
            } else if (escolhaComputador == 3) {
                System.out.println("Você perdeu!");
            }

            break;

        case 3:
            if(escolhaComputador == 1){
                System.out.println("Você perdeu!");
            } else if (escolhaComputador == 2) {
                System.out.println("Você ganhou!");
            } else if (escolhaComputador == 3) {
                System.out.println("Empatou!");
            }

            break;

        default: break;
    }

// bloco de código que será executado se nenhum dos cases for aceito

        }


    }
}