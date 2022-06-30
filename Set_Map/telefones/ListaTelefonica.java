import java.util.HashMap;
import java.util.ArrayList;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        listaTelefonica = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if (listaTelefonica.containsKey(nome)) {
            ArrayList<Telefone> telefones = listaTelefonica.get(nome);
            telefones.add(telefone);
            listaTelefonica.put(nome, telefones);
        } else {
            ArrayList<Telefone> telefones = new ArrayList<Telefone>();
            telefones.add(telefone);
            listaTelefonica.put(nome, telefones);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {
        if (listaTelefonica.containsKey(nome)) {
            return listaTelefonica.get(nome);
        } else {
            return null;
        }
    }
}
