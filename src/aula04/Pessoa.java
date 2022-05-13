package aula04;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected String RG;

    public Pessoa(String nome, String CPF, String RG) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}
