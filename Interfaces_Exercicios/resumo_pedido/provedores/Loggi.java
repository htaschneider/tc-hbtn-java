package provedores;

public class Loggi implements ProvedorFrete {

    public Frete calcularFrete(double peso, double valor) {
        double preco = peso > 5000 ? valor * 0.12 : valor * 0.04;
        return new Frete(preco, TipoProvedorFrete.LOGGI);
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }

}
