public class Imovel {

    // TODO criar métodos construtores que ajudem na hora de ler do arquivo ou
    // na hora de criar um novo do zero


    public Imovel(String documento, String descricao, String valor) {
        this.documento = documento;
        this.descricao = descricao;
        this.valor = valor;
    }

    // TODO criar os demais atributos: descricao como string, valor como double

    private String documento;
    private String descricao;
    private String valor;

    @Override
    public String toString() {
        return (descricao + ", Preço: " + valor);
    }

    public static Imovel fromLine(String linha) throws Exception {
        String[] partes = linha.split(";");
//        if (partes.length < 3) {
//            throw new Exception("Linha inválida: " + linha);
//        }
        return new Imovel(partes[0], partes[1], partes[2]);
    }

    public String getDocumento() {
        return documento;
    }

//    public void setDocumento(String documento){
//        this.documento = documento;
//    }

    public void update(String documento) {
        this.documento = documento;
    }
}