package crudescola;

import java.util.Scanner;

//Classe com implementação das funções de CRUD do diretor
public class GerenciadorDiretor {
    private Diretor diretor;
    private Scanner leitura;
    
    public GerenciadorDiretor(){
        leitura = new Scanner(System.in);
    }

    public void cadDiretor(){
        System.out.println("Informe os dados do diretor:");
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
        
        diretor = new Diretor(nome,cpf,form,sal);        
    }
    
    public void lerDiretor(){
        System.out.println("Diretor atual: ");
        System.out.println("Nome: " + diretor.getNome());
        System.out.println("CPF: " + diretor.getCpf());
        System.out.println("Formacao: " + diretor.getFormacao());
        System.out.println("Salario: R$" + diretor.getSalario());
        System.out.println();
    }
    
    public void alterarDiretor(){
        System.out.println("Informe os dados do novo diretor:");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        System.out.print("Formacao academica: ");
        String form = leitura.nextLine();
        System.out.print("Salario: R$");
        float sal = leitura.nextFloat();
        leitura.nextLine();
        
        diretor = new Diretor(nome,cpf,form,sal);         
    }
    
    public void excluirDiretor(){
        diretor.setNome("");
        diretor.setCpf("");
        diretor.setFormacao("");
        diretor.setSalario(0.0f);
    }
}
