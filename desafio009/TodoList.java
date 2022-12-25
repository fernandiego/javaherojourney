
import java.util.Scanner;
import java.util.List;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TodoList {

    private List<Tarefa> tarefas = new ArrayList<>();
    private Scanner input;

    public TodoList() throws Exception {
        carregaTarefas();
        menu();
    }

    public static void main(String... args) throws Exception {
        new TodoList();
    }

    private void carregaTarefas() throws Exception {
        Scanner s = new Scanner(new FileInputStream("tarefas.txt"));
        while (s.hasNextLine()) {
            tarefas.add(new Tarefa(s.nextLine()));
        }
        s.close();
    }

    private void menu() throws Exception {
        if (input == null) {
            input = new Scanner(System.in);
        }
        String op = null;
        while (!"d".equals(op)) {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.printf("%d - %s\n", (i + 1), tarefas.get(i));
            }
            System.out.println();
            System.out.println("a - Adicionar");
            System.out.println("b - Concluir");
            System.out.println("c - Remover");
            System.out.println("d - Sair");
            System.out.println();
            System.out.println("O que você deseja fazer?");
            op = input.nextLine();
            switch (op) {
                case "a":
                    novaTarefa();
                    break;
                case "b":
                    concluiTarefa();
                    break;
                case "c":
                    removeTarefa();
                    break;
                case "d":
                    sair();
                    break;
            }
        }
    }

    private void novaTarefa() throws Exception {
        System.out.println("Digite a tarefa pra incluir:");
        String nome = input.nextLine();
        tarefas.add(new Tarefa(nome));
//        System.out.println(nome+" teste imprimir");
    }

    private void concluiTarefa() {
        System.out.println("Digite o número da tarefa para concluir:");
        int i = input.nextInt();
        tarefas.get(i-1).concluir();
    }

    private void removeTarefa() {
        System.out.println("Digite o número da tarefa para remover:");
        int i = input.nextInt();
        tarefas.remove(i-1);
    }

    private void sair() throws Exception {
        PrintWriter writer = new PrintWriter("tarefas.txt");
        tarefas.forEach(writer::println);
        writer.flush();
        writer.close();
    }
}
