package main.java.list.ListaCompras;
import main.java.list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNomeItem().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.remove(itensParaRemover);
    }

    public int calcularValorTotal(){
        int total = 0;

        for(Item item: itemList){
            total += item.getPrecoItem() * item.getQuantidadeItem();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O preço total dos itens é: " + carrinhoDeCompras.calcularValorTotal());


    }
}
