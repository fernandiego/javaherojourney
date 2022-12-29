public class Pessoa {

    // TODO criar métodos construtores que ajudem na hora de ler do arquivo ou
    // na hora de criar um novo do zero

    // TODO criar o atributos nome como string

    private String documento;
    private String nome;

    public Pessoa(String documento, String nome) {
        this.documento = documento;
        this.nome = nome;
    }

    public static Pessoa fromLine(String linha) throws Exception {
        String[] partes = linha.split(";");
//        if (partes.length < 3) {
//            throw new Exception("Linha inválida: " + linha);
//        }
        return new Pessoa(partes[0], partes[1]);
    }
    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }
}