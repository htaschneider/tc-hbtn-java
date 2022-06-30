import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String phrase) {
        phrase = phrase.toLowerCase().replace(".", "").replace("!", "").replace("?", "");

        TreeMap<String, Integer> contagem = new TreeMap<>();
        for (String word : phrase.split(" ")) {
            if (!contagem.containsKey(word)) {
                contagem.put(word, 0);
            }
            contagem.put(word, contagem.get(word) + 1);
        }

        return contagem;
    }

}
