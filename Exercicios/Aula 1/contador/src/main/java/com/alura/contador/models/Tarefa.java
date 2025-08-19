package com.alura.contador.models;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    public Tarefa(){}

    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "Descricao: " + getDescricao() +
                ", Concluida: " + isConcluida() +
                ", Responsavel: " + getPessoaResponsavel();
    }
}
