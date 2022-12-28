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
        return String.format("%s,%s,%d", nome, status, tratado);
    }

    public void tratar() {
        status = "em tratamento";
        tratado++;
    }

    public void curar() {
        status = "curado";
    }

    public static Pet fromLine(String linha) throws Exception {
        String[] partes = linha.split(",");
        if (partes.length < 3) {
            throw new Exception("Linha inválida: " + linha);
        }
        return new Pet(partes[0], partes[1], Integer.parseInt(partes[2]));
    }

    public boolean isCurado() {
        return "curado".equals(status);
    }

    public boolean isEmTratamento() {
        return "em tratamento".equals(status);
    }
}