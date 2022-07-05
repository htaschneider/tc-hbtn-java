import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome) {
        this.nome = nome;
        this.transacoes = new ArrayList<Double>();
    }

    public void adicionarTransacao(Double valor) {
        this.transacoes.add(valor);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

}