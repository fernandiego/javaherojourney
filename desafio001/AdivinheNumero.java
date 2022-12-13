public class AdivinheNumero {
    public static void main(String[] args){
        int numeroSecreto = 7;
        int acertouErrouNumero = Integer.parseInt(args[0]);

        if (acertouErrouNumero == numeroSecreto)
        {
            System.out.println("Acertou mizeravi");
        }
        else
        {
            System.out.println("errooou");
        }
    }
}