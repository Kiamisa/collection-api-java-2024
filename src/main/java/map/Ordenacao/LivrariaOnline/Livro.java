package main.java.map.Ordenacao.LivrariaOnline;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    // Construtor
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Preço: R$ " + preco;
    }
}
