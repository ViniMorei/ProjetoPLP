package crudescola;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTurmas {
    private ArrayList<Turma> turmas;
    private Scanner leitura;

    public GerenciadorTurmas() {
        turmas = new ArrayList();
        leitura = new Scanner(System.in);
        
        Turma turma = new Turma(3,1,10);
        turmas.add(turma);
    }
    
    public void cadTurma(){
        System.out.println("Informe os dados da turma:");
        System.out.print("Serie: ");
        int serie = leitura.nextInt();
        System.out.print("Numero: ");
        int numero = leitura.nextInt();
        System.out.print("Capacidade maxima de alunos: ");
        int capacidade = leitura.nextInt();
        System.out.println();
        
        Turma turma = new Turma(serie,numero,capacidade);
        turmas.add(turma);
        
        System.out.println("Turma criada!");
    }
    
    public void lerTurmas() {
        System.out.println("Lista de turmas cadastradas:");
        for (int i = 0; i < turmas.size(); i++) {
            Turma turma = turmas.get(i);
            System.out.println("Indice: " + i);
            System.out.println("Serie: " + turma.getSerie());
            System.out.println("Numero: " + turma.getNumero());
            System.out.println("Capacidade maxima: " + turma.getCapacidade());
            System.out.println();
        }
    }
    
    public void alterarTurma() {
        System.out.print("Digite o índice da Turma a ser alterada: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice >= 0 && indice < turmas.size()) {
            Turma turma = turmas.get(indice);

            System.out.println("Informe os novos dados da turma:");
            System.out.print("Serie: ");
            int serie = leitura.nextInt();
            System.out.print("Numero: ");
            int numero = leitura.nextInt();
            System.out.print("Capacidade maxima de alunos: ");
            int capacidade = leitura.nextInt();
            System.out.println();
        
            turma.setSerie(serie);
            turma.setNumero(numero);
            turma.setCapacidade(capacidade);
        
            System.out.println("Turma alterada com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }    
    
    public void excluirTurma() {
        System.out.print("Digite o índice da turma a ser excluída: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice >= 0 && indice < turmas.size()) {
            turmas.remove(indice);
            System.out.println("Turma excluída com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
