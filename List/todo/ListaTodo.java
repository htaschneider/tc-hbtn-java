import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas = new ArrayList<>();

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        for (Tarefa t : tarefas) {
            if (t.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException(
                        String.format("Tarefa com identificador %d ja existente na lista", t.getIdentificador()));
            }
        }

        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == id) {
                tarefa.setDone();
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == id) {
                tarefa.setUndone();
                return true;
            }
        }

        return false;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setUndone();
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setDone();
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.printf("[%s]  Id: %d - Descricao: %s\n", tarefa.estahFeita() ? "X" : " ",
                    tarefa.getIdentificador(),
                    tarefa.getDescricao());
        }
    }
}