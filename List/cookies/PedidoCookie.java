public class PedidoCookie {
    private String sabor;
    private int quantidadeDeCaixas;

    public PedidoCookie(String sabor, int quantidadeDeCaixas) {
        this.sabor = sabor;
        this.quantidadeDeCaixas = quantidadeDeCaixas;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidadeDeCaixas() {
        return quantidadeDeCaixas;
    }

    public void setQuantidadeDeCaixas(int quantidadeDeCaixas) {
        this.quantidadeDeCaixas = quantidadeDeCaixas;
    }

}
