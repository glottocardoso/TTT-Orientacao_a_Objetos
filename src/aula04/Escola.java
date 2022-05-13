package aula04;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Escola {
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Professor> professores;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Aluno> alunos;

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

    public void addAluno(String nome, String CPF, String RG, int idade, String turma, int[] notasCiencia, int[] notasPortugues, int[] notasMatematica){
        Aluno aluno = new Aluno(nome, CPF, RG, idade, turma,notasCiencia,notasPortugues,notasMatematica);
        if (!alunos.contains(aluno)){
            alunos.add(aluno);
        }
    }

    public void editFuncionario(String nome, String CPF, String RG, String cargo, BigDecimal salario){
        Funcionario updatedFuncionario = new Funcionario(nome, CPF, RG, cargo, salario);
        if (funcionarios.contains(updatedFuncionario)){
            int i = funcionarios.indexOf(updatedFuncionario);
            funcionarios.get(i).setNome(nome);
            funcionarios.get(i).setCPF(CPF);
            funcionarios.get(i).setRG(RG);
            funcionarios.get(i).setCargo(cargo);
            funcionarios.get(i).setSalario(salario);
        }else {
            System.out.println("Funcionário inexistente");
        }
    }

    public void editAluno(String nome, String CPF, String RG, int idade, String turma,int[] notasCiencia, int[] notasPortugues, int[] notasMatematica){
        Aluno updatedAluno = new Aluno(nome, CPF, RG, idade, turma,notasCiencia,notasPortugues, notasMatematica);
        if (alunos.contains(updatedAluno)){
            int i = alunos.indexOf(updatedAluno);
            alunos.get(i).setNome(nome);
            alunos.get(i).setCPF(CPF);
            alunos.get(i).setRG(RG);
            alunos.get(i).setIdade(idade);
            alunos.get(i).setTurma(turma);
        }else {
            System.out.println("Aluno inexistente");
        }
    }

    public void editProfessor(String nome, String CPF, String RG, String[] turmas, BigDecimal salario, String[] disciplinas){
        Professor updatedProfessor = new Professor(nome, CPF, RG, turmas, salario,disciplinas);
        if (professores.contains(updatedProfessor)){
            int i = professores.indexOf(updatedProfessor);
            professores.get(i).setNome(nome);
            professores.get(i).setCPF(CPF);
            professores.get(i).setRG(RG);
            professores.get(i).setTurmas(turmas);
            professores.get(i).setSalario(salario);
            professores.get(i).setDisciplinas(disciplinas);
        }else {
            System.out.println("Professor inexistente");
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

    public void listFuncionarios(){
        list(funcionarios);
    }

    public void listAlunos(){
        list(alunos);
    }

    public void listProfessores(){
        list(professores);
    }

    public void list(ArrayList lista) {
        lista.forEach(item -> {
            System.out.println(item.toString());
        });
    }

    public void listFuncionarioEspecifico(String cpf) {
        int indexFuncionario = retornaIndexFuncionario(cpf);
        System.out.println(funcionarios.get(indexFuncionario).toString());
    }

    public void listProfessorEspecifico(String cpf) {
        int indexProfessor = retornaIndexProfessor(cpf);
        System.out.println(professores.get(indexProfessor).toString());
    }

    public void listAlunoEspecifico(String cpf) {
        int indexAluno = retornaIndexAluno(cpf);
        System.out.println(alunos.get(indexAluno).toString());
    }


}
