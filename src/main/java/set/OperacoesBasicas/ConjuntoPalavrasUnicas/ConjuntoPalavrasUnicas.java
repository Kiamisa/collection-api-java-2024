package main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasUnicasSet.isEmpty()){
            if(palavrasUnicasSet.contains(palavra)){
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(this.palavrasUnicasSet);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Alice");
        conjuntoPalavrasUnicas.adicionarPalavra("Bob");
        conjuntoPalavrasUnicas.adicionarPalavra("Charlie");
        conjuntoPalavrasUnicas.adicionarPalavra("David");

        System.out.println("Palavras no conjunto:");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("Verificar se a palavra 'Alice' está no conjunto: " + conjuntoPalavrasUnicas.verificarPalavra("Alice"));
        System.out.println("Verificar se a palavra 'Eve' está no conjunto: " + conjuntoPalavrasUnicas.verificarPalavra("Eve"));

        conjuntoPalavrasUnicas.removerPalavra("David");
        System.out.println("Palavras no conjunto após a remoção:");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
