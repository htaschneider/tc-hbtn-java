import java.util.ArrayList;
import java.util.stream.Collectors;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
    }

    public int obterTotalCaixas() {
        return this.cookies.stream().mapToInt(pedido -> pedido.getQuantidadeDeCaixas()).sum();
    }

    public int removerSabor(String sabor) {
        int removed = 0;
        ArrayList<PedidoCookie> new_cookies = new ArrayList<>();
        for (PedidoCookie cookie : cookies) {
            if (cookie.getSabor() != sabor) {
                new_cookies.add(cookie);
            } else {
                removed += cookie.getQuantidadeDeCaixas();
            }
        }
        this.cookies = new_cookies;
        return removed;
    }
}
