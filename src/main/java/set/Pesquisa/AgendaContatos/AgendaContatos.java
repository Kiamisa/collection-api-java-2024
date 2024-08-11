package main.java.set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatosSet.add(new Contatos(nome, numero));
    }

    public void exibirContatos() {
            System.out.println(contatosSet);
    }

    public Set<Contatos> pesquisarPorNome(String nome) {
        Set<Contatos> contatos = new HashSet<>();
        for (Contatos contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatos.add(contato);
            }
        }
        return contatos;
    }

    public Contatos atualizarNumerosContato(String nome, int novoNumero) {
        Contatos contatoAtualizado = null;
        for (Contatos contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        Contatos contatoAtualizado = agendaContatos.atualizarNumerosContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }

}
