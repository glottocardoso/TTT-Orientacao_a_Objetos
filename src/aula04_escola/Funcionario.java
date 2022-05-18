package aula04_escola;

import java.math.BigDecimal;

public class Funcionario extends Pessoa{
    private String cargo;
    private BigDecimal salario;

    public Funcionario(String nome, String CPF, String RG, String cargo, BigDecimal salario) {
        super(nome, CPF, RG);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                '}';
    }
}
