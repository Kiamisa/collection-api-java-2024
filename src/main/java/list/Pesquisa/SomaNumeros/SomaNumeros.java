package main.java.list.Pesquisa.SomaNumeros;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros = new ArrayList<>();
    }

    public int calcularSoma(){
        int soma = 0;
        for (int numero: numeros)
            soma += numero;
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        if (numeros.isEmpty()) {
            for (int numero : numeros) {
                if (numero > maior) {
                    maior = numero;
                }
            }
            return maior;
        } else {
            throw new IllegalArgumentException("Lista vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for (int numero: numeros){
            if (numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
