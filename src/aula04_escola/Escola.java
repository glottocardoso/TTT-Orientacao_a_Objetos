package aula04_escola;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Escola {
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Professor> professores;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Aluno> alunos;

    public Escola() {
        pessoas = new ArrayList<Pessoa>();
        professores = new ArrayList<Professor>();
        funcionarios = new ArrayList<Funcionario>();
        alunos = new ArrayList<Aluno>();
    }

    public void addAluno(String nome, String CPF, String RG, int idade, String turma, ArrayList<Notas> notas){
        Aluno aluno = new Aluno(nome, CPF, RG, idade, turma,notas);
        if (!this.alunos.contains(aluno)){
            this.alunos.add(aluno);
        }
    }

    public void addAluno(String nome, String CPF, String RG, int idade, String turma){
        Aluno novoAluno = new Aluno(nome, CPF, RG, idade, turma);
        if(retornaIndexAluno(novoAluno.CPF)==-1){
            this.alunos.add(novoAluno);
        }
    }

    public void addFuncionario(String nome, String CPF, String RG, String cargo, BigDecimal salario){
        Funcionario funcionario = new Funcionario(nome, CPF, RG, cargo, salario);
        if (!funcionarios.contains(funcionario)){
            funcionarios.add(funcionario);
        }
    }

    public void addProfessor(String nome, String CPF, String RG, String[] turmas, BigDecimal salario, String[] disciplinas){
        Professor professor = new Professor(nome, CPF, RG, turmas, salario, disciplinas);
        if (!professores.contains(professor)){
            professores.add(professor);
        }
    }

    public void editAluno(String cpfOriginal, String nome, String CPF, String RG, int idade, String turma){
        int indexAluno = retornaIndexAluno(cpfOriginal);
        if (indexAluno==-1){
            System.out.println("Aluno inexistente");
        }else{
            alunos.get(indexAluno).setNome(nome);
            alunos.get(indexAluno).setCPF(CPF);
            alunos.get(indexAluno).setRG(RG);
            alunos.get(indexAluno).setIdade(idade);
            alunos.get(indexAluno).setTurma(turma);
        }
    }

    public void editFuncionario(String cpfOriginal,String nome, String CPF, String RG, String cargo, BigDecimal salario){
        int indexFuncionario = retornaIndexFuncionario(cpfOriginal);
        if (indexFuncionario==-1){
            System.out.println("Funcionário inexistente");
        }else{
            funcionarios.get(indexFuncionario).setNome(nome);
            funcionarios.get(indexFuncionario).setCPF(CPF);
            funcionarios.get(indexFuncionario).setRG(RG);
            funcionarios.get(indexFuncionario).setCargo(cargo);
            funcionarios.get(indexFuncionario).setSalario(salario);
        }
    }

    public void editProfessor(String cpfOriginal, String nome, String CPF, String RG, String[] turmas, BigDecimal salario, String[] disciplinas){
        int indexProfessor = retornaIndexProfessor(cpfOriginal);
       if (indexProfessor==-1){
           System.out.println("Professor inexistente");
       }else {
           professores.get(indexProfessor).setNome(nome);
           professores.get(indexProfessor).setCPF(CPF);
           professores.get(indexProfessor).setRG(RG);
           professores.get(indexProfessor).setTurmas(turmas);
           professores.get(indexProfessor).setSalario(salario);
           professores.get(indexProfessor).setDisciplinas(disciplinas);
       }
    }

    public void deleteAluno(String CPF){
        int indexAluno = retornaIndexAluno(CPF);
        if (indexAluno !=-1){
            alunos.remove(indexAluno);
        }
    }

    public void deleteFuncionario(String CPF){
        int indexFuncionario = retornaIndexFuncionario(CPF);
        if (indexFuncionario !=-1){
            funcionarios.remove(indexFuncionario);
        }
    }

    public void deleteProfessor(String CPF){
        int indexProfessor = retornaIndexProfessor(CPF);
        if (indexProfessor !=-1){
            professores.remove(indexProfessor);
        }
    }

    int retornaIndexAluno(String cpf){
        for (Aluno aluno:alunos){
             if (aluno.CPF.equals(cpf)){
                 return alunos.indexOf(aluno);
             }
        }
        return -1;
    }

    int retornaIndexFuncionario(String cpf){
        for (Funcionario funcionario:funcionarios){
            if (funcionario.CPF.equals(cpf)){
                return funcionarios.indexOf(funcionario);
            }
        }
        return -1;
    }

    int retornaIndexProfessor(String cpf){
        for (Professor professor:professores){
            if (professor.CPF.equals(cpf)){
                return professores.indexOf(professor);
            }
        }
        return -1;
    }

    public void listAlunos(){
        list(alunos);
    }

    public void listFuncionarios(){
        list(funcionarios);
    }

    public void listProfessores(){
        list(professores);
    }

    public void list(ArrayList lista) {
        lista.forEach(item -> {
            System.out.println(item.toString());
        });
    }

    public void listAlunoEspecifico(String cpf) {
        int indexAluno = retornaIndexAluno(cpf);
        System.out.println(alunos.get(indexAluno).toString());
    }

    public void listFuncionarioEspecifico(String cpf) {
        int indexFuncionario = retornaIndexFuncionario(cpf);
        System.out.println(funcionarios.get(indexFuncionario).toString());
    }

    public void listProfessorEspecifico(String cpf) {
        int indexProfessor = retornaIndexProfessor(cpf);
        System.out.println(professores.get(indexProfessor).toString());
    }

    public void setNota(String cpfAluno, String disciplina, int nota){
        int indexAluno = retornaIndexAluno(cpfAluno);
        Aluno aluno = alunos.get(indexAluno);
        aluno.setNota(disciplina, nota);
    }

    public void calcularMedia(String cpf){
        int indexAluno = retornaIndexAluno(cpf);
        Aluno aluno = alunos.get(indexAluno);
        double media = aluno.calcularMedia();
        String nomeAluno = aluno.getNome();
        System.out.println("A média do aluno "+nomeAluno+ " é: "+media);
    }

}
