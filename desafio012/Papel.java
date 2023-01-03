public class Papel {
    private String nome;
    private int valor;

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome + ";" + valor;
    }

    public Papel(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Papel(String linha) {
        String[] partes = linha.split(";");
        nome = partes[0];
        valor = Integer.parseInt(partes[1]);
    }
}