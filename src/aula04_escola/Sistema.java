package aula04_escola;

import java.math.BigDecimal;

public class Sistema {
    public static void main(String[] args) {
        Escola escola = new Escola();

        System.out.println("==========ADICIONANDO==========");

        escola.addAluno("Guilherme Lotto Cardoso", "122.122.122-48","48.480.480-4",30,"A");
        escola.addAluno("Felipe dos Santos", "123.123.123-12","12.501.359-9",25,"C");
        escola.addFuncionario("Alberto Cunha", "122.323.122-12", "54.544.544-6", "Secretário", new BigDecimal(2400));
        escola.addFuncionario("Roberto Freitas", "234.234.234-34", "21.320.578-1", "Diretor", new BigDecimal(10000));
        escola.addProfessor("João Paulo", "580.520.563-63", "30.314.380-4", new String[]{"A", "B"},new BigDecimal(7000), new String[]{"Geografia", "Matemática"});
        escola.addProfessor("Rodolfo Rodrigues", "400.400.400-40", "40.440.440-4", new String[]{"A", "B"},new BigDecimal(7000), new String[]{"Português", "Matemática"});

        System.out.println("Lista de Alunos:");
        escola.listAlunos();
        System.out.println("Lista de Funcionários:");
        escola.listFuncionarios();
        System.out.println("Lista de Professores:");
        escola.listProfessores();

        System.out.println("==========MODIFICANDO==========");

        System.out.println("Lista de Alunos:");
        escola.listAlunos();
        escola.editAluno("122.122.122-48", "Guilherme Lotto Cardoso", "122.122.122-48","48.480.480-4",31,"B");
        System.out.println("Nova lista");
        escola.listAlunos();

        System.out.println("Lista de Funcionários:");
        escola.listFuncionarios();
        escola.editFuncionario("122.323.122-12", "Alberto Cunha", "122.323.122-12", "54.544.544-6", "Assistente Pleno", new BigDecimal(3000));
        System.out.println("Nova lista");
        escola.listFuncionarios();

        System.out.println("Lista de Professores:");
        escola.listProfessores();
        escola.editProfessor("400.400.400-40","Rodolfo Rodrigues", "400.400.400-40", "40.440.440-4", new String[]{"A", "B","C"},new BigDecimal(9000), new String[]{"Português", "Matemática","Ciências"});
        System.out.println("Nova lista");
        escola.listProfessores();

        System.out.println("==========DELETANDO==========");

        System.out.println("Lista de Alunos:");
        escola.listAlunos();
        escola.deleteAluno("123.123.123-12");
        System.out.println("Nova lista");
        escola.listAlunos();

        System.out.println("Lista de Funcionários:");
        escola.listFuncionarios();
        escola.deleteFuncionario("234.234.234-34");
        System.out.println("Nova lista");
        escola.listFuncionarios();

        System.out.println("Lista de Professores:");
        escola.listProfessores();
        escola.deleteProfessor("400.400.400-40");
        System.out.println("Nova lista");
        escola.listProfessores();

        System.out.println("==========EXIBINDO DADOS==========");

        System.out.println("Aluno:");
        escola.listAlunoEspecifico("122.122.122-48");
        System.out.println("Funcionário:");
        escola.listFuncionarioEspecifico("122.323.122-12");
        System.out.println("Professor:");
        escola.listProfessorEspecifico("580.520.563-63");

        System.out.println("==========NOTAS==========");
        escola.setNota("122.122.122-48","Matemática",10);
        escola.setNota("122.122.122-48","Ciências",8);
        escola.setNota("122.122.122-48","Português",5);
        escola.calcularMedia("122.122.122-48");
    }
}
