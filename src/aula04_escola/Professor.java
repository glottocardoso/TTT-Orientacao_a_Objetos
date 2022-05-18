package aula04_escola;

import java.math.BigDecimal;
import java.util.Arrays;

public class Professor extends Pessoa{
    private String[] turmas;
    private BigDecimal salario;
    private String[] disciplinas;

    public Professor(String nome, String CPF, String RG, String[] turmas, BigDecimal salario, String[] disciplinas) {
        super(nome, CPF, RG);
        this.turmas = turmas;
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    public void setTurmas(String[] turmas) {
        this.turmas = turmas;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", turmas=" + Arrays.toString(turmas) +
                ", salario=" + salario +
                ", disciplinas=" + Arrays.toString(disciplinas) +
                '}';
    }
}
