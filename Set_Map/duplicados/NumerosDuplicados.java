import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {
        TreeSet<Integer> doubles = new TreeSet<>();
        HashSet<Integer> uniques = new HashSet<>();

        for (int number : numeros) {
            if (!uniques.add(number)) {
                doubles.add(number);
            }
        }

        return doubles;
    }

}