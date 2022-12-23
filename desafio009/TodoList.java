import java.util.List;
import java.util.ArrayList;

public class TodoList {

    private List<Tarefa> tarefas = new ArrayList<>(); 

    public TodoList() throws Exception {
        carregaTarefas();
        menu();
    }

    public static void main(String ...args) throws Exception {
        new TodoList();
    }

    private void carregaTarefas(){}
    private void menu(){}
    private void novaTarefa(){}
    private void concluiTarefa(int numero){}
    private void removeTarefa(int numero){}
    private void sair(){}
}
