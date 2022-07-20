import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos()
                .stream()
                .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos
                .stream()
                .filter(hasEletronics())
                .collect(Collectors.toList());
    }

    private static Predicate<? super Pedido> hasEletronics() {
        return pedido -> pedido.getProdutos()
                .stream()
                .anyMatch(p -> p.getCategoria() == CategoriaProduto.ELETRONICO);
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos
                .stream()
                .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos
                .stream()
                .filter(p -> p.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }
}
