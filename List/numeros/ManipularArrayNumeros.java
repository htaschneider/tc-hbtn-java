import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
        return numeros.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) throws Exception {
        if (numeros.contains(numero)) {
            throw new Exception("Numero jah contido na lista");
        }

        numeros.add(numero);
    }

    public static void removerNumero(List<Integer> numeros, int numero) throws Exception {
        int index = buscarPosicaoNumero(numeros, numero);
        if (index == -1) {
            throw new Exception("Numero nao encontrado na lista");
        }

        numeros.remove(index);
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int index = buscarPosicaoNumero(numeros, numeroSubstituir);
        if (index == -1) {
            numeros.add(numeroSubstituto);
        } else {
            numeros.set(index, numeroSubstituto);
        }
    }

}