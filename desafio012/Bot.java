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

    public int getCapital() {
        return capital;
    }

    public int getQuantidadePapel() {
        return quantidadePapel;
    }

    public void posicao() {
        System.out.printf("Cash: %d\nPapel: %d %s\n", capital, quantidadePapel, nomePapel);
    }

    public void opera(Papel p) {
       System.out.println("Papel em carteira: "+ p);
       if(quantidadePapel > 0 && p.getValor() > precoVenda){
           quantidadePapel--;
           capital+=p.getValor();
       }
       else if(p.getValor() > precoCompra && capital > p.getValor() ){
           quantidadePapel++;
           capital-= p.getValor();
       }

    }
}