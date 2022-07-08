public class Jornal extends Midia {
    private int quantidadeDeArtigos;

    public Jornal(String nome, int quantidadeDeArtigos) {
        super(nome);
        this.quantidadeDeArtigos = quantidadeDeArtigos;
    }

    public int getQuantidadeDeArtigos() {
        return quantidadeDeArtigos;
    }

}
