public class Contato {
    String nome;
    String numero;
    TipoNumero tipoNumero;

    public Contato(String nome, String numero, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numero = numero;
        this.tipoNumero = tipoNumero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

}
