import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;

public class Bolsinha {

    private List<Papel> papeis = new ArrayList<>();
    private Bot bot;

    public Bolsinha(String[] args) throws Exception {
        String tempo = args[0];
        String capitalInicialBot = args[1];
        String papelNegociadoBot = args[2];
        String precoCompraBot = args[3];
        String precoVendaBot = args[4];

        bot = new Bot(
                Integer.parseInt(capitalInicialBot),
                papelNegociadoBot,
                Integer.parseInt(precoCompraBot),
                Integer.parseInt(precoVendaBot)
        );

        carregaPapeis();
        bot.posicao();
        simula(Integer.parseInt(tempo) * 60);
    }

    private void carregaPapeis() throws Exception {
        try (Scanner b3 = new Scanner(new FileInputStream("B3.csv"))) {
            while (b3.hasNext()) {
                papeis.add(new Papel(b3.nextLine()));
            }
        }
        System.out.println(papeis);
    }

    private void simula(int tempo) throws Exception {
        while (tempo-- > 0) {
            papeis.forEach(this::variaPreco);
            // TODO pega papel pro bot operar
            for (int i = 0; i < papeis.size(); i++) {
                if(papeis.get(i).getNome().equals(bot.getNomePapel())){
                    bot.opera(papeis.get(i));
                }
            }
            System.out.println(papeis);
            bot.posicao();
            // pausa de um segundo
            Thread.sleep(1000l);
        }
    }

    private void variaPreco(Papel p) {
        int varia = (int) (Math.random() * 30) - 13;
        int valor = p.getValor();
        if(varia < 0) varia *= 1;
        if (varia >= valor) p.setValor(varia);
        else {
            if (varia % 2 == 0) p.setValor(valor + varia);
            else p.setValor(valor - varia);
        }
    }

    public static void main(String[] args) throws Exception {
        new Bolsinha(args);
    }
}