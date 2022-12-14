import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Clinic {

    private List<Pet> animais = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public Clinic() throws Exception {
        carrega();
        menu();
        salva();
    }

    private void carrega() throws Exception {
        File file = new File("pet-clinic.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner loader = new Scanner(file);
        while (loader.hasNext()) {
            animais.add(Pet.fromLine(loader.nextLine()));
        }
        loader.close();
    }

    private void menu() throws Exception {
        String op = null;
        while (!"f".equals(op)) {
            System.out.println("O que deseja?");
            System.out.println();
            System.out.println("a) ver todos os animais");
            System.out.println("b) ver curados");
            System.out.println("c) ver em tratamento");
            System.out.println("d) marcar curado");
            System.out.println("e) marcar em tratamento");
            System.out.println("f) Salvar e sair");
            op = input.nextLine();
            switch (op) {
                case "a":
                    lista(null);
                    break;
                case "b":
                    lista("curados");
                    break;
                case "c":
                    lista("em tratamento");
                    break;
                case "d":
                    cura();
                    break;
                case "e":
                    trata();
                    break;
            }
        }
    }

    private void salva() throws Exception {
        PrintWriter writer = new PrintWriter("pet-clinic.txt");
        animais.forEach(animal -> writer.println(animal.toLine()));
        writer.flush();
        writer.close();
    }

    private void lista(String status) throws Exception {
        // TODO implementar
        List<Pet> animaisFiltro = animais
                .stream()
                .filter(c -> {

                    if (status == null) {
                        return true;
//                System.out.println(i + 1 + ") " + animais.get(i));
                    } else if (status.equals("curados")) {
                        return c.isCurado();


                    } else if (status.equals("em tratamento")) {
                        return c.isEmTratamento();
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toList());
        for (int i = 0; i < animaisFiltro.size(); i++) {
        System.out.println(i + 1 + ") " + animaisFiltro.get(i));
        }

    }

    private void cura() throws Exception {
        lista("em tratamento");
        System.out.println("Qual deles marcar como curado?");
        int i = input.nextInt();
        animais.stream().filter(a -> a.isEmTratamento()).collect(Collectors.toList()).get(i - 1).curar();
    }

    private void trata() throws Exception {
        lista("curados");
        System.out.println("Qual deles colocar em tratamento?");
        int i = input.nextInt();
        animais.stream().filter(a -> a.isCurado()).collect(Collectors.toList()).get(i - 1).tratar();
    }

}