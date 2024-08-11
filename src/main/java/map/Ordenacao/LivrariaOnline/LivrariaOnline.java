package main.java.map.Ordenacao.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    // Construtor
    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    // Método para adicionar um livro à livraria
    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro novoLivro = new Livro(titulo, autor, preco);
        livros.put(link, novoLivro);
    }

    // Método para remover um livro da livraria pelo título
    public void removerLivro(String titulo) {
        String linkParaRemover = null;
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                linkParaRemover = entry.getKey();
                break;
            }
        }
        if (linkParaRemover != null) {
            livros.remove(linkParaRemover);
            System.out.println("Livro '" + titulo + "' removido com sucesso.");
        } else {
            System.out.println("Livro com título '" + titulo + "' não encontrado.");
        }
    }

    // Método para exibir os livros em ordem crescente de preço
    public void exibirLivrosOrdenadosPorPreco() {
        List<Livro> listaDeLivros = new ArrayList<>(livros.values());
        listaDeLivros.sort(Comparator.comparingDouble(Livro::getPreco));

        for (Livro livro : listaDeLivros) {
            System.out.println(livro);
        }
    }

    // Método para pesquisar livros por autor
    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        for (Livro livro : livros.values()) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosDoAutor.add(livro);
            }
        }
        return livrosDoAutor;
    }

    // Método para obter o livro mais caro
    public Livro obterLivroMaisCaro() {
        return Collections.max(livros.values(), Comparator.comparingDouble(Livro::getPreco));
    }

    // Método para obter o livro mais barato
    public Livro exibirLivroMaisBarato() {
        return Collections.min(livros.values(), Comparator.comparingDouble(Livro::getPreco));
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe LivrariaOnline
        LivrariaOnline minhaLivraria = new LivrariaOnline();

        minhaLivraria.adicionarLivro("https://amazon.com/livro1", "Java Básico", "Autor A", 50.0);
        minhaLivraria.adicionarLivro("https://amazon.com/livro2", "Java Avançado", "Autor B", 75.0);
        minhaLivraria.adicionarLivro("https://amazon.com/livro3", "Estruturas de Dados", "Autor A", 65.0);
        minhaLivraria.adicionarLivro("https://amazon.com/livro4", "Algoritmos", "Autor C", 40.0);

        System.out.println("Livros ordenados por preço:");
        minhaLivraria.exibirLivrosOrdenadosPorPreco();

        System.out.println("\nLivros do autor 'Autor A':");
        List<Livro> livrosAutorA = minhaLivraria.pesquisarLivrosPorAutor("Autor A");
        for (Livro livro : livrosAutorA) {
            System.out.println(livro);
        }

        System.out.println("\nLivro mais caro:");
        System.out.println(minhaLivraria.obterLivroMaisCaro());

        System.out.println("\nLivro mais barato:");
        System.out.println(minhaLivraria.exibirLivroMaisBarato());

        System.out.println("\nRemovendo o livro 'Java Básico'.");
        minhaLivraria.removerLivro("Java Básico");

        System.out.println("\nLivros ordenados por preço após remoção:");
        minhaLivraria.exibirLivrosOrdenadosPorPreco();
    }
}
