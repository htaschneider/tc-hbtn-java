import java.util.Arrays;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        return Arrays.asList(itens).stream()
                .mapToDouble(item -> item.getQuantidade() * item.getProduto().obterPrecoLiquido())
                .sum() * (1 - percentualDesconto / 100);
    }

}
