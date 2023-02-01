public class Bot {

    private int capital;
    private String nomePapel;
    private int precoCompra;
    private int precoVenda;
    private int quantidadePapel;

    public Bot(int capital, String nomePapel, int precoCompra, int precoVenda) {
        this.capital = capital;
        this.nomePapel = nomePapel;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidadePapel = 0;
    }

    public String getNomePapel() {
        return nomePapel; // pega o nome do papel
    }

    public void posicao() {
        System.out.printf("Capital: %d\nPapel: %d %s\n", capital, quantidadePapel, nomePapel);
    }

    public void opera(Papel p) {
       System.out.println("Meu papel é: "+ p);
       if(p.getValor() > precoCompra){
           quantidadePapel++;
           capital-= p.getValor();
       }
    }
}