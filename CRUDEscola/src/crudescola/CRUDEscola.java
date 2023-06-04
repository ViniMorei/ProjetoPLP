package crudescola;

import java.util.Scanner;

public class CRUDEscola {

    public static void main(String[] args) {
       GerenciadorProfessores professores = new GerenciadorProfessores();
       GerenciadorDiretor diretor = new GerenciadorDiretor();
       GerenciadorCoordenadores coordenadores = new GerenciadorCoordenadores();
       GerenciadorTurmas turmas = new GerenciadorTurmas();
       GerenciadorAlunos alunos = new GerenciadorAlunos();
       Scanner leitura = new Scanner(System.in);
       
       
       
       int opcao = -1;
       int opcao2;
       while (opcao != 0){
            System.out.println("=== Menu ===");
            System.out.println("1. Opcoes de cadastro");
            System.out.println("2. Opcoes de leitura");
            System.out.println("3. Opcoes de edicao");
            System.out.println("4. Opcoes de exclusao");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = leitura.nextInt();
            leitura.nextLine();
            System.out.println();

            switch (opcao) {
                case 1 -> {
                    System.out.println("=== Menu de cadastro ===");
                    System.out.println("1. Matricular aluno");
                    System.out.println("2. Cadastrar professor");
                    System.out.println("3. Cadastrar coordenador");
                    System.out.println("4. Cadastrar diretor");
                    System.out.println("5. Criar turma");
                    System.out.println("0. Voltar");
                    opcao2 = leitura.nextInt();
                    
                    switch (opcao2){
                        case 1 -> alunos.cadAluno();
                        case 2 -> professores.cadProfessor();
                        case 3 -> coordenadores.cadCoordenador();
                        case 4 -> diretor.cadDiretor();
                        case 5 -> turmas.cadTurma();
                        case 0 -> System.out.println("Voltando...");
                        default -> System.out.println("Opcao invalida!");
                    }
               }

                case 2 -> {
                    System.out.println("=== Menu de leitura ===");
                    System.out.println("1. Ler alunos");
                    System.out.println("2. Ler professores");
                    System.out.println("3. Ler coordenadores");
                    System.out.println("4. ler diretores");
                    System.out.println("5. Ler turmas");
                    System.out.println("0. Voltar");
                    opcao2 = leitura.nextInt();
                    
                    switch (opcao2){
                        case 1 -> alunos.lerAlunos();
                        case 2 -> professores.lerProfessores();
                        case 3 -> coordenadores.lerCoordenadores();
                        case 4 -> diretor.lerDiretor();
                        case 5 -> turmas.lerTurmas();
                        case 0 -> System.out.println("Voltando...");
                        default -> System.out.println("Opcao invalida!");
                    }
               }
                case 3 -> {
                    System.out.println("=== Menu de edicao ===");
                    System.out.println("1. Editar aluno");
                    System.out.println("2. Editar professor");
                    System.out.println("3. Editar coordenador");
                    System.out.println("4. Editar diretor");
                    System.out.println("5. Editar turma");
                    System.out.println("0. Voltar");
                    opcao2 = leitura.nextInt();
                    
                    switch (opcao2){
                        case 1 -> alunos.alterarAluno();
                        case 2 -> professores.alterarProfessor();
                        case 3 -> coordenadores.alterarCoordenador();
                        case 4 -> diretor.alterarDiretor();
                        case 5 -> turmas.alterarTurma();
                        case 0 -> System.out.println("Voltando...");
                        default -> System.out.println("Opcao invalida!");
                    }
               }
                case 4 -> {
                    System.out.println("=== Menu de exclusao ===");
                    System.out.println("1. Excluir aluno");
                    System.out.println("2. Excluir professor");
                    System.out.println("3. Excluir coordenador");
                    System.out.println("4. Excluir diretor");
                    System.out.println("5. Excluir turma");
                    System.out.println("0. Voltar");
                    opcao2 = leitura.nextInt();
                    
                    switch (opcao2){
                        case 1 -> alunos.excluirAluno();
                        case 2 -> professores.excluirProfessor();
                        case 3 -> coordenadores.excluirCoordenador();
                        case 4 -> diretor.excluirDiretor();
                        case 5 -> turmas.excluirTurma();
                        case 0 -> System.out.println("Voltando...");
                        default -> System.out.println("Opcao invalida!");
                    }
               }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida!");
            }

            System.out.println();
       }
       
    }
}
