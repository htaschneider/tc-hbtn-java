package provedores;

public class Sedex implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        double preco = peso > 1000 ? valor * 0.1 : valor * 0.05;
        return new Frete(preco, TipoProvedorFrete.SEDEX);
    }
}