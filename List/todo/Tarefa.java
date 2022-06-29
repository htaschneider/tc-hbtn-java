public class Tarefa {

    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        modificarDescricao(descricao);
        this.identificador = identificador;
        this.estahFeita = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean estahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void modificarDescricao(String descricao) throws Exception {
        if (descricao.equals("")) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }

        this.descricao = descricao;
    }

    public void setDone() {
        estahFeita = true;
    }

    public void setUndone() {
        estahFeita = false;
    }

}