import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        listaTelefonica = new HashMap<String, HashSet<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) throws Exception {
        for (Map.Entry<String, HashSet<Telefone>> entry : listaTelefonica.entrySet()) {
            String name = entry.getKey();
            HashSet<Telefone> phonebook = entry.getValue();

            if (phonebook.contains(telefone) && !nome.equals(name)) {
                throw new Exception("Telefone jah pertence a outra pessoa");
            }
        }

        if (listaTelefonica.containsKey(nome)) {
            HashSet<Telefone> telefones = listaTelefonica.get(nome);
            if (telefones.contains(telefone)) {
                throw new Exception("Telefone jah existente para essa pessoa");
            }
            telefones.add(telefone);
            listaTelefonica.put(nome, telefones);
        } else {
            HashSet<Telefone> telefones = new HashSet<Telefone>();
            telefones.add(telefone);
            listaTelefonica.put(nome, telefones);
        }
    }

    public HashSet<Telefone> buscar(String nome) {
        if (listaTelefonica.containsKey(nome)) {
            return listaTelefonica.get(nome);
        } else {
            return null;
        }
    }
}
