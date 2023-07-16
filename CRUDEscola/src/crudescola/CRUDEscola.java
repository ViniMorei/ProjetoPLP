package crudescola;

import java.util.Scanner;
import Telas.Principal;

public class CRUDEscola {

    public static void main(String[] args) {
       /*GerenciadorProfessores professores = new GerenciadorProfessores();
       GerenciadorDiretor diretor = new GerenciadorDiretor();
       GerenciadorCoordenadores coordenadores = new GerenciadorCoordenadores();
       GerenciadorTurmas turmas = new GerenciadorTurmas();
       GerenciadorAlunos alunos = new GerenciadorAlunos();
       Scanner leitura = new Scanner(System.in);*/
       
       Principal principal = new Principal();
       principal.setVisible(true);
       
       int opcao = -1;
       int opcao2;
       /*while (opcao != 0){
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
                        case 1 -> alunos.cadastrar();
                        case 2 -> professores.cadastrar();
                        case 3 -> coordenadores.cadastrar();
                        case 4 -> diretor.cadastrar();
                        case 5 -> turmas.cadastrar();
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
                        case 1 -> alunos.visualizar();
                        case 2 -> professores.visualizar();
                        case 3 -> coordenadores.visualizar();
                        case 4 -> diretor.visualizar();
                        case 5 -> turmas.visualizar();
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
                        case 1 -> alunos.alterar();
                        case 2 -> professores.alterar();
                        case 3 -> coordenadores.alterar();
                        case 4 -> diretor.alterar();
                        case 5 -> turmas.alterar();
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
                        case 1 -> alunos.excluir();
                        case 2 -> professores.excluir();
                        case 3 -> coordenadores.excluir();
                        case 4 -> diretor.excluir();
                        case 5 -> turmas.excluir();
                        case 0 -> System.out.println("Voltando...");
                        default -> System.out.println("Opcao invalida!");
                    }
               }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida!");
            }

            System.out.println();
       }
       */
    }
}
