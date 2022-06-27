import exceptions.*;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }

    public int getQuantidadeDeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        super.sacar(0.10);
        quantidadeTransacoes++;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        super.sacar(0.10);
        quantidadeTransacoes++;
    }
}
