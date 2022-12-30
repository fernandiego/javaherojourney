public class Veiculo {

    // TODO criar métodos construtores que ajudem na hora de ler do arquivo ou
    // na hora de criar um novo do zero

    // TODO criar os demais atributos: descricao como string, valor como double


    private String documento;
    private String descricao;
    private String valor;

    public Veiculo(String documento, String descricao, String valor) {
        this.documento = documento;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String toString() {
        return (descricao + ", Preço: " + valor);
    }

    public static Veiculo fromLine(String linha) throws Exception {
        String[] partes = linha.split(";");
//        if (partes.length < 3) {
//            throw new Exception("Linha inválida: " + linha);
//        }
        return new Veiculo(partes[0], partes[1], partes[2]);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}