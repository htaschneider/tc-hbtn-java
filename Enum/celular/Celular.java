import java.util.ArrayList;

public class Celular {
    ArrayList<Contato> contatos;

    public Celular() {
        contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    public void adicionarContato(Contato contato) throws Exception {
        if (obterPosicaoContato(contato.getNome()) != -1) {
            throw new Exception("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato contatoNovo) throws Exception {
        int posicao = obterPosicaoContato(contatoAntigo.getNome());
        if (posicao == -1) {
            throw new Exception("Nao foi possivel modificar contato. Contato nao existe");
        }

        int posicaoNovo = obterPosicaoContato(contatoNovo.getNome());
        if (posicaoNovo != -1 && posicaoNovo != posicao) {
            throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        contatos.set(posicao, contatoNovo);
    }

    public void removerContato(Contato contato) throws Exception {
        int posicao = obterPosicaoContato(contato.getNome());
        if (posicao == -1) {
            throw new Exception("Nao foi possivel remover contato. Contato nao existe");
        }
        contatos.remove(posicao);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.printf("%s -> %s (%s)\n", contato.getNome(), contato.getNumero(), contato.getTipoNumero());
        }
    }

}
