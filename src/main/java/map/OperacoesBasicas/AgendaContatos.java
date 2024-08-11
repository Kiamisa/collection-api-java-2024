package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer numero) {
        this.agendaContatosMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println("Contatos: "+ agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContatos("João", 123456789);
        agenda.adicionarContatos("Maria", 987654321);
        agenda.adicionarContatos("José", 456789123);
        agenda.exibirContatos();
        agenda.removerContato("Maria");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("José"));
    }
}
