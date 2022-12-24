public class Tarefa {

    private String nome;
    private boolean concluida;

    public Tarefa(String linha) throws Exception {
        String partes[] = linha.split(":");
        nome = partes[0];
        if (partes.length > 1) {
            concluida = Boolean.parseBoolean(partes[1]);
        }
    }

    public void concluir() {
        concluida = true;
    }

    @Override
    public String toString() {
        return nome + ":" + concluida;
    }
}