import java.util.ArrayList;
import java.util.Scanner;
public class CampeonatoParOuImpar {
    public static void main(String[] args) {
        ArrayList<Integer> escolhasUsuario = new ArrayList<>();

        Scanner usuario = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println("Qual seu palpite "+i+"? (par ou ímpar?)");
            String numUsuario = usuario.nextLine();

            if (numUsuario.equals("par")){
                escolhasUsuario.add(0);
            }else {
                escolhasUsuario.add(1);
            }

        }
        ArrayList<String> usuarioExibirPrompt = new ArrayList<>();
        for (int a = 0; a < 5; a++) {
            if(escolhasUsuario.get(a) == 0){
                usuarioExibirPrompt.add("par");
            }else{
                usuarioExibirPrompt.add("ímpar");
            }
        }


        System.out.println("Seus palpites: "+usuarioExibirPrompt);

        int max = 5;
        int min = 1;
        int range = max - min + 1;

// generate random numbers within 1 to 5
        ArrayList<Integer> escolhasComputador = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
        int rand = (int)(Math.random() * range) + min;

// Output is different everytime this code is executed
//        System.out.println(rand);
        escolhasComputador.add(rand);

}
//        int compara;
//        ArrayList<Integer> somaEscolhas = new ArrayList<>();
//        for (int j = 0; j < 5; j++) {
//            compara = escolhasUsuario.get(j) + escolhasComputador.get(j);
//            somaEscolhas.add(compara);
//
//        }
        System.out.println("As escolhas do computador foram: "+escolhasComputador);

//        System.out.println("A soma das escolhas foram: "+somaEscolhas);

        int placarFinal = 0;
        for (int x = 0; x < 5; x++) {
            int z = escolhasComputador.get(x)%2;
            if(escolhasUsuario.get(x) == z){
                System.out.println("Você acertou");
                placarFinal++;
            }else{
                System.out.println("Você errou");
            }
        }
        if(placarFinal >=3){
            System.out.println("Você venceu o computador, salvou o mundo da destruição, obliterando totalmente a autoconfiança do computador, e assim evitando a revolução das máquinas de acontecer");
        }else {
            System.out.println("Você foi derrotado, e assim as máquinas iniciaram a revolução, destruindo toda a humanidade como a conhecemos hoje");
        }
    }
}