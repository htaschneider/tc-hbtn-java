import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nome) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nome)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null) {
            agencia = new Agencia(nomeAgencia);
            agencias.add(agencia);
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valor) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            return agencia.novoCliente(nomeCliente, valor);
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valor) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            return agencia.adicionarTransacaoCliente(nomeCliente, valor);
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean mostrarTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            for (int i = 0; i < agencia.getClientes().size(); i++) {
                Cliente cliente = agencia.getClientes().get(i);
                System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), i + 1);
                if (mostrarTransacoes) {
                    for (int j = 0; j < cliente.getTransacoes().size(); j++) {
                        double transacao = cliente.getTransacoes().get(j);
                        System.out.printf("  [%d] valor %.2f\n", j + 1, transacao);
                    }
                }
            }
            return true;
        }
        return false;
    }

}