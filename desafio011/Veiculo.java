public class Veiculo {

    // TODO criar métodos construtores que ajudem na hora de ler do arquivo ou
    // na hora de criar um novo do zero

    // TODO criar os demais atributos: descricao como string, valor como double


    private String documento;
    private String descricao;
    private double valor;

    public Veiculo(String documento, String descricao, double valor) {
        this.documento = documento;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static Veiculo fromLine(String linha) throws Exception {
        String[] partes = linha.split(";");
//        if (partes.length < 3) {
//            throw new Exception("Linha inválida: " + linha);
//        }
        return new Veiculo(partes[0], partes[1], Double.parseDouble(partes[2]));
    }
    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }
}