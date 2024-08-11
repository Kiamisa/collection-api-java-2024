package main.java.set.Pesquisa.ListaTarefas;

public class Tarefa {
    private String descricao;
    private boolean finalizada;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.finalizada = false;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean isFinalizada() {
        return this.finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", finalizada=" + finalizada +
                '}';
    }
}
