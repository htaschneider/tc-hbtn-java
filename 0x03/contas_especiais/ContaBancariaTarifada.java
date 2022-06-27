import exceptions.*;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeDeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeDeTransacoes = 0;
    }

    public int getQuantidadeDeTransacoes() {
        return quantidadeDeTransacoes;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        super.sacar(0.10);
        quantidadeDeTransacoes++;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        super.sacar(0.10);
        quantidadeDeTransacoes++;
    }
}
