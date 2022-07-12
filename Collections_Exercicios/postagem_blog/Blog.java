import java.util.*;
import static java.util.stream.Collectors.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) throws Exception {
        boolean postExiste = posts.stream()
                .anyMatch(p -> p.getTitulo().equals(post.getTitulo()) && p.getAutor().equals(post.getAutor()));

        if (postExiste) {
            throw new Exception("Postagem jah existente");
        }

        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        return posts.stream().map(Post::getAutor).collect(toSet());
    }

    public Map<Categorias, Long> obterContagemPorCategoria() {
        return posts.stream().collect(groupingBy(Post::getCategoria, counting()));
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        return posts.stream().filter(post -> post.getCategoria().equals(categoria)).collect(toSet());
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        return posts.stream().filter(post -> post.getAutor().equals(autor)).collect(toSet());
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        return posts.stream().collect(groupingBy(Post::getCategoria, toSet()));
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        return posts.stream().collect(groupingBy(Post::getAutor, toSet()));
    }

}
