import java.util.Arrays;

import produtos.Dvd;
import produtos.Livro;
import produtos.Produto;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double totalSemDesconto() {
        return Arrays.asList(itens).stream()
                .mapToDouble(item -> item.getQuantidade() * item.getProduto().obterPrecoLiquido())
                .sum();
    }

    public double calcularTotal() {
        return totalSemDesconto() * (1 - percentualDesconto / 100);
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            if (produto instanceof Livro) {
                Livro livro = (Livro) produto;
                System.out.printf("Tipo: Livro  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                        livro.getTitulo(), livro.obterPrecoLiquido(), item.getQuantidade(), livro.obterPrecoLiquido());
            } else {
                Dvd dvd = (Dvd) produto;
                System.out.printf("Tipo: Dvd  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                        dvd.getTitulo(), dvd.obterPrecoLiquido(), item.getQuantidade(), dvd.obterPrecoLiquido());

            }
        }
        System.out.println("\n----------------------------");
        System.out.printf("DESCONTO: %.2f\n", totalSemDesconto() - calcularTotal());
        System.out.printf("TOTAL PPRODUTOS: %.2f\n", totalSemDesconto());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }

}
