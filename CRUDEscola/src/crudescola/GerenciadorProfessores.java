package crudescola;

import java.util.ArrayList;
import java.util.Scanner;

//Classe com as funções do CRUD do professor
public class GerenciadorProfessores {
    private ArrayList<Professor> professores;
    private Scanner leitura;

    public GerenciadorProfessores() {
        professores = new ArrayList();
        leitura = new Scanner(System.in);
        
        Professor professor = new Professor("Maximus Saulo","000","Engenharia de Software",5000,
                                    40,"Logica de Programacao");
        professores.add(professor);
    }
    
    public void cadProfessor(){
        System.out.println("Informe os dados do professor:");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        System.out.print("Formacao academica: ");
        String form = leitura.nextLine();
        System.out.print("Disciplina: ");
        String disc = leitura.nextLine();
        System.out.print("Carga horaria: ");
        int carga = leitura.nextInt();
        System.out.print("Salario: R$");
        float sal = leitura.nextFloat();
        leitura.nextLine();
        System.out.println();
        
        Professor professor = new Professor(nome,cpf,form,sal,carga,disc);
        professores.add(professor);
        
        System.out.println("Professor cadastrado!");
    }
    
    public void lerProfessores() {
        System.out.println("Lista de professores cadastrados:");
        for (int i = 0; i < professores.size(); i++) {
            Professor professor = professores.get(i);
            System.out.println("Indice: " + i);
            System.out.println("Nome: " + professor.getNome());
            System.out.println("CPF: " + professor.getCpf());
            System.out.println("Formacao: " + professor.getFormacao());
            System.out.println("Salario: R$" + professor.getSalario());
            System.out.println("Carga Horaria: " + professor.getCargaHoraria());
            System.out.println("Disciplina: " + professor.getDisciplina());
            System.out.println();
        }
    }
    
    public void alterarProfessor() {
        System.out.print("Digite o índice do professor a ser alterado: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice >= 0 && indice < professores.size()) {
            Professor professor = professores.get(indice);

            System.out.println("Informe os dados novos do professor:");
            System.out.print("Nome: ");
            String nome = leitura.nextLine();
            System.out.print("CPF: ");
            String cpf = leitura.nextLine();
            System.out.print("Formacao academica: ");
            String form = leitura.nextLine();
            System.out.print("Disciplina: ");
            String disc = leitura.nextLine();
            System.out.print("Carga horaria: ");
            int carga = leitura.nextInt();
            System.out.print("Salario: R$");
            float sal = leitura.nextFloat();
            leitura.nextLine();

            professor.setNome(nome);
            professor.setCpf(cpf);
            professor.setFormacao(form);
            professor.setDisciplina(disc);
            professor.setCargaHoraria(carga);
            professor.setSalario(sal);

            System.out.println("Professor alterado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }    
    
    public void excluirProfessor() {
        System.out.print("Digite o índice do professor a ser excluído: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice >= 0 && indice < professores.size()) {
            professores.remove(indice);
            System.out.println("Professor excluído com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
