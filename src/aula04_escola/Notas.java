package aula04_escola;

public class Notas {
    private String disciplina;
    private int nota;

    public Notas(String disciplina, int nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }
}
