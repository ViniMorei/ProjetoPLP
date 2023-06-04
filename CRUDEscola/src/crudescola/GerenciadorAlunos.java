package crudescola;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorAlunos {
    private ArrayList<Aluno> alunos;
    private Scanner leitura;

    public GerenciadorAlunos() {
        alunos = new ArrayList();
        leitura = new Scanner(System.in);
        
        Aluno aluno = new Aluno("Italo Freitas","1234",15,1);
        alunos.add(aluno);
    }
    
    public void cadAluno(){
        System.out.println("Informe os dados do aluno:");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Matricula: ");
        String matricula = leitura.nextLine();
        System.out.print("Idade: ");
        int idade = leitura.nextInt();
        System.out.print("Turma: ");
        int turma = leitura.nextInt();
        System.out.println();
        
        Aluno aluno = new Aluno(nome,matricula,idade,turma);
        alunos.add(aluno);
        
        System.out.println("Aluno matriculado!");
    }
    
    public void lerAlunos() {
        System.out.println("Lista de alunos cadastrados:");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Indice: " + i);
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Turma: " + aluno.getTurma());
            System.out.println();
        }
    }
    
    public void alterarAluno() {
        System.out.print("Digite o índice do aluno a ser alterado: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice >= 0 && indice < alunos.size()) {
            Aluno aluno = alunos.get(indice);

            System.out.println("Informe os dados novos do aluno:");
            System.out.print("Nome: ");
            String nome = leitura.nextLine();
            System.out.print("Matricula: ");
            String matricula = leitura.nextLine();
            System.out.print("Idade: ");
            int idade = leitura.nextInt();
            System.out.print("Turma: ");
            int turma = leitura.nextInt();
            leitura.nextLine();

            aluno.setNome(nome);
            aluno.setMatricula(matricula);
            aluno.setIdade(idade);
            aluno.setTurma(turma);

            System.out.println("Aluno alterado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }    
    
    public void excluirAluno() {
        System.out.print("Digite o índice do aluno a ser excluído: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice >= 0 && indice < alunos.size()) {
            alunos.remove(indice);
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
