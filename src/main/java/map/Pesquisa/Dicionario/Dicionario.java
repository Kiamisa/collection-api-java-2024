package main.java.map.Pesquisa.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    // Construtor
    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    // Método para adicionar uma palavra e sua definição ao dicionário
    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    // Método para remover uma palavra do dicionário
    public void removerPalavra(String palavra) {
        dicionario.remove(palavra);
    }

    // Método para exibir todas as palavras e suas definições
    public void exibirPalavras() {
        if (dicionario.isEmpty()) {
            System.out.println("O dicionário está vazio.");
        } else {
            for (Map.Entry<String, String> entry : dicionario.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    // Método para pesquisar uma palavra e retornar sua definição
    public String pesquisarPorPalavra(String palavra) {
        if (dicionario.containsKey(palavra)) {
            return palavra + ": " + dicionario.get(palavra);
        } else {
            return "A palavra '" + palavra + "' não foi encontrada no dicionário.";
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Dicionario
        Dicionario meuDicionario = new Dicionario();
        meuDicionario.adicionarPalavra("Computador", "Máquina eletrônica que armazena e processa dados.");
        meuDicionario.adicionarPalavra("Java", "Linguagem de programação orientada a objetos.");
        meuDicionario.adicionarPalavra("Rede", "Conjunto de computadores interligados.");

        System.out.println("Pesquisando 'Java': " + meuDicionario.pesquisarPorPalavra("Java"));

        System.out.println("\nTodas as palavras no dicionário:");
        meuDicionario.exibirPalavras();

        System.out.println("\nRemovendo a palavra 'Rede'.");
        meuDicionario.removerPalavra("Rede");

        System.out.println("\nTodas as palavras no dicionário após remoção:");
        meuDicionario.exibirPalavras();
    }
}

