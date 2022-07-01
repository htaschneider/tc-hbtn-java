import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        for (Post post : posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();
        for (Post post : posts) {
            String categoria = post.getCategoria();
            if (!contagem.containsKey(categoria)) {
                contagem.put(categoria, 0);
            }
            contagem.put(categoria, contagem.get(categoria) + 1);
        }
        return contagem;
    }

}
