package aula04;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private int idade;
    private String turma;
    private int[] notasCiencia;
    private int[] notasPortugues;
    private int[] notasMatematica;

    public Aluno(String nome, String CPF, String RG, int idade, String turma, int[] notasCiencia, int[] notasPortugues, int[] notasMatematica) {
        super(nome, CPF, RG);
        this.idade = idade;
        this.turma = turma;
        this.notasCiencia = notasCiencia;
        this.notasPortugues = notasPortugues;
        this.notasMatematica = notasMatematica;
    }

    public Aluno(String nome, String CPF, String RG, int[] notasCiencia, int[] notasPortugues, int[] notasMatematica) {
        super(nome, CPF, RG);
        this.notasCiencia = notasCiencia;
        this.notasPortugues = notasPortugues;
        this.notasMatematica = notasMatematica;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "idade=" + idade +
                ", turma='" + turma + '\'' +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                '}';
    }
}
