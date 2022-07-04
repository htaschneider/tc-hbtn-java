import java.util.*;
import static java.util.stream.Collectors.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) throws Exception {
        for (Post p : posts) {
            if (p.getTitulo().equals(post.getTitulo()) && p.getAutor().equals(post.getAutor())) {
                throw new Exception("Postagem jah existente");
            }
        }

        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        return posts.stream().map(Post::getAutor).collect(toSet());
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new HashMap<Categorias, Integer>();
        for (Post post : posts) {
            if (!contagem.containsKey(post.getCategoria())) {
                contagem.put(post.getCategoria(), 0);
            }
            contagem.put(post.getCategoria(), contagem.get(post.getCategoria()) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        return posts.stream().filter(post -> post.getCategoria().equals(categoria)).collect(toSet());
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        return posts.stream().filter(post -> post.getAutor().equals(autor)).collect(toSet());
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new HashMap<Categorias, Set<Post>>();
        for (Post post : posts) {
            if (!postsPorCategoria.containsKey(post.getCategoria())) {
                postsPorCategoria.put(post.getCategoria(), new HashSet<Post>());
            }
            postsPorCategoria.get(post.getCategoria()).add(post);
        }
        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new HashMap<Autor, Set<Post>>();
        for (Post post : posts) {
            if (!postsPorAutor.containsKey(post.getAutor())) {
                postsPorAutor.put(post.getAutor(), new HashSet<Post>());
            }
            postsPorAutor.get(post.getAutor()).add(post);
        }
        return postsPorAutor;
    }

}
