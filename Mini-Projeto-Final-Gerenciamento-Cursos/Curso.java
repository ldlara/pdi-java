package cursos;

import java.util.ArrayList;
import java.util.List;

public abstract class Curso implements Gerenciavel {
    protected String nome;
    protected int capacidadeMaxima;
    protected List<Aluno> alunos;
    
    public Curso(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunos = new ArrayList<>();
    }
    
    public void inscreverAluno(Aluno aluno) throws LimiteDeAlunosException {
        if (alunos.size() >= capacidadeMaxima) {
            throw new LimiteDeAlunosException("Limite de alunos atingido para o curso: " + nome);
        }
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso no curso " + nome);
    }
    
    @Override
    public void listarAlunos() {
        System.out.println("Alunos inscritos no curso " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Capacidade Máxima: " + capacidadeMaxima);
        System.out.println("Número de Alunos Inscritos: " + alunos.size());
    }
}
