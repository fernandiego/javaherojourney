public class Pet {

    private String nome;
    private String status;
    private int tratado;

    public Pet(String nome) {
        this(nome, "em tratamento", 1);
    }   

    public Pet(String nome, String status, int tratado) {
        this.nome = nome;
        this.status = status;
        this.tratado = tratado;
    }

    @Override
    public String toString() {
        return String.format("%s, tratado %d vez(es)", nome, tratado);
    }

    public String toLine() {
        return String.format("%s,%s,%d",nome,status,tratado);
    }

    public void tratar() {
        status = "em tratamento";
        tratado++;
    }

    public void curar() {
        status = "curado";
    }

    public static Pet fromLine(String linha) {
        String partes = linha.split(",");
        return new Pet(partes[0], partes[1], Integer.parseInt(partes[2]));
    }
}