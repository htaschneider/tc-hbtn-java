import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double precentualMarkup;

    public Supplier<Double> precoComMarkup = () -> preco * (1 + precentualMarkup / 100);
    public Consumer<Double> atualizarMarkup = (precentualMarkup) -> this.precentualMarkup = precentualMarkup;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.precentualMarkup = 10;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
