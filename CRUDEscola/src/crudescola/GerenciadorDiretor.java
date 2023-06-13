package crudescola;

//Importando a classe Scanner para que o programa tenha suporte a entrada de dados
import java.util.Scanner;

//Classe com implementação das funções de CRUD do diretor
public class GerenciadorDiretor {
    //Atributos
    private Diretor diretor;
    private Scanner leitura;
    
    //Método construtor, inicializado de maneira que já exista um diretor ao iniciar o programa
    public GerenciadorDiretor(){
        leitura = new Scanner(System.in);
        
        diretor = new Diretor("Keylla Cileny", "999", "Boiologia", 10000);
    }

    //Método utilizado para criar um objeto diretor
    public void cadastrar(){
        //Recebendo os atributos do diretor
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
        
        //Usando os valores recebidos por input como parâmetros do método construtor da classe Diretor
        diretor = new Diretor(nome,cpf,form,sal);        
    }
    
    //Método utilizado para mostrar ao usuário o diretor atual
    public void visualizar(){
        System.out.println("Diretor atual: ");
        System.out.println("Nome: " + diretor.getNome());
        System.out.println("CPF: " + diretor.getCpf());
        System.out.println("Formacao: " + diretor.getFormacao());
        System.out.println("Salario: R$" + diretor.getSalario());
        System.out.println();
    }
    
    //Método utilizado para alterar os dados do diretor cadastrado
    public void alterar(){
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
    
    //Método utilizado para "excluir" o diretor cadastrado
    public void excluir(){
        diretor.setNome("");
        diretor.setCpf("");
        diretor.setFormacao("");
        diretor.setSalario(0.0f);
    }
}
