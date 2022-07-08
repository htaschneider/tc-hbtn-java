public class Jornal extends Midia {
    private int quantidadeArtigos;

    public Jornal(String nome, int quantidadeDeArtigos) {
        super(nome);
        this.quantidadeArtigos = quantidadeDeArtigos;
    }

    public int getQuantidadeDeArtigos() {
        return quantidadeArtigos;
    }

}
