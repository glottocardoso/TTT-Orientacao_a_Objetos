package aula04_escola;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private int idade;
    private String turma;
    private ArrayList<Notas> notas;

    public Aluno(String nome, String CPF, String RG, int idade, String turma, ArrayList<Notas> notas) {
        super(nome, CPF, RG);
        this.idade = idade;
        this.turma = turma;
        this.notas = notas;
    }

    public Aluno(String nome, String CPF, String RG, int idade, String turma) {
        super(nome, CPF, RG);
        this.idade = idade;
        this.turma = turma;
        this.notas = new ArrayList<Notas>();
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setNota(String disciplina, int nota) {
        Notas novaNota = new Notas(disciplina, nota);
        this.notas.add(novaNota);
    }

    public void setNotas(ArrayList<Notas> notas) {
        this.notas = notas;
    }

    public double  calcularMedia(){
        int somaNotas = 0;
        for (Notas nota:this.notas){
            somaNotas+= nota.getNota();
        }
        double media = (double) somaNotas/this.notas.size();
        return media;
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
