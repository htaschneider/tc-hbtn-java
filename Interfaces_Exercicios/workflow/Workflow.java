import java.util.List;
import java.util.ArrayList;

import atividades.*;

public class Workflow {
    private List<Atividade> atividades;

    public Workflow() {
        atividades = new ArrayList<Atividade>();
    }

    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}
