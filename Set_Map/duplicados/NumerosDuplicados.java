import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {
        HashSet<Integer> duplicados = new HashSet<Integer>();
        for (int n : numeros) {
            duplicados.add(n);
        }

        TreeSet<Integer> duplicadosOrdenados = new TreeSet<Integer>();
        duplicadosOrdenados.addAll(duplicados);
        return duplicadosOrdenados;
    }

}