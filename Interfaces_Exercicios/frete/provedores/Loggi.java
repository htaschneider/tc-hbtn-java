package provedores;

public class Loggi implements ProvedorFrete {

    public Frete calcularFrete(double peso, double valor) {
        double preco = peso > 5000 ? valor * 0.12 : valor * 1.04;
        return new Frete(preco, TipoProvedorFrete.SEDEX);
    }

}