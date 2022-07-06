package provedores;

public class JadLog implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        double preco = peso > 2000 ? valor * 0.07 : valor * 0.045;
        return new Frete(preco, TipoProvedorFrete.SEDEX);
    }
}