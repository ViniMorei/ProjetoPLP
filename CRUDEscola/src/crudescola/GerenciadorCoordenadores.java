package crudescola;

import java.util.ArrayList;
import java.util.Scanner;

//Classe com implementações das funções de CRUD de coordenador
public class GerenciadorCoordenadores {
    private ArrayList<Coordenador> coordenadores;
    private Scanner leitura;

    public GerenciadorCoordenadores() {
        coordenadores = new ArrayList();
        leitura = new Scanner(System.in);
    }
    
    public void cadCoordenador(){
        System.out.println("Informe os dados do coordenador:");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        System.out.print("Formacao academica: ");
        String form = leitura.nextLine();
        System.out.print("Salario: R$");
        float sal = leitura.nextFloat();
        leitura.nextLine();
        System.out.println();
        
        Coordenador coordenador = new Coordenador(nome,cpf,form,sal);
        coordenadores.add(coordenador);
        
        System.out.println("Coordenador cadastrado!");
    }
    
    public void lerCoordenadores() {
        System.out.println("Lista de coordenadores cadastrados:");
        for (int i = 0; i < coordenadores.size(); i++) {
            Coordenador coordenador = coordenadores.get(i);
            System.out.println("Indice: " + i);
            System.out.println("Nome: " + coordenador.getNome());
            System.out.println("CPF: " + coordenador.getCpf());
            System.out.println("Formacao: " + coordenador.getFormacao());
            System.out.println("Salario: R$" + coordenador.getSalario());
            System.out.println();
        }
    }
    
    public void alterarCoordenador() {
        System.out.print("Digite o índice do coordenador a ser alterado: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice >= 0 && indice < coordenadores.size()) {
            Coordenador coordenador = coordenadores.get(indice);

            System.out.println("Informe os dados novos do coordenador:");
            System.out.print("Nome: ");
            String nome = leitura.nextLine();
            System.out.print("CPF: ");
            String cpf = leitura.nextLine();
            System.out.print("Formacao academica: ");
            String form = leitura.nextLine();
            System.out.print("Salario: R$");
            float sal = leitura.nextFloat();
            leitura.nextLine();

            coordenador.setNome(nome);
            coordenador.setCpf(cpf);
            coordenador.setFormacao(form);
            coordenador.setSalario(sal);

            System.out.println("Coordenador alterado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }    
    
    public void excluirCoordenador() {
        System.out.print("Digite o índice do coordenador a ser excluído: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        if (indice >= 0 && indice < coordenadores.size()) {
            coordenadores.remove(indice);
            System.out.println("Coordenador excluído com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
