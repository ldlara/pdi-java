package aplicacao;

import cursos.Aluno;
import cursos.Curso;
import cursos.CursoOnline;
import cursos.CursoPresencial;
import excecoes.LimiteDeAlunosException;

public class TesteCursos {
    public static void main(String[] args) {
        // Criação dos cursos
        Curso cursoOnline = new CursoOnline("Java Avançado", 2, "Udemy");
        Curso cursoPresencial = new CursoPresencial("Engenharia de Software", 3, "Campus Central");
        
        // Criação de alunos
        Aluno aluno1 = new Aluno("João", "001");
        Aluno aluno2 = new Aluno("Maria", "002");
        Aluno aluno3 = new Aluno("Pedro", "003");
        Aluno aluno4 = new Aluno("Ana", "004");
        
        // Inscrição em Curso Online (limite de 2 alunos)
        try {
            cursoOnline.inscreverAluno(aluno1);
            cursoOnline.inscreverAluno(aluno2);
            // Esta inscrição excederá o limite e lançará exceção
            cursoOnline.inscreverAluno(aluno3);
        } catch (LimiteDeAlunosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        // Inscrição em Curso Presencial (limite de 3 alunos)
        try {
            cursoPresencial.inscreverAluno(aluno1);
            cursoPresencial.inscreverAluno(aluno3);
            cursoPresencial.inscreverAluno(aluno4);
        } catch (LimiteDeAlunosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        // Exibe detalhes dos cursos e alunos inscritos
        System.out.println("\nDetalhes do Curso Online:");
        cursoOnline.exibirDetalhes();
        cursoOnline.listarAlunos();
        
        System.out.println("\nDetalhes do Curso Presencial:");
        cursoPresencial.exibirDetalhes();
        cursoPresencial.listarAlunos();
    }
}
