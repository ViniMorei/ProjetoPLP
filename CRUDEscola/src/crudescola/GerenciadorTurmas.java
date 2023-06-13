package crudescola;

import java.util.ArrayList; //Importando a classe ArrayList para que o programa tenha suporte a listas
import java.util.Scanner; // Importando a classe Scanner para que o programa tenha suporte a entrada de dados

//Classe com implementação das funções de CRUD das turmas
public class GerenciadorTurmas {
    //Atributos
    private ArrayList<Turma> turmas;
    private Scanner leitura;

    //Método construtor, escrito de forma que já exista uma turma cadstrada ao iniciar o programa
    public GerenciadorTurmas() {
        //Inicializa a lista das turmas
        turmas = new ArrayList();
        leitura = new Scanner(System.in);
        
        Turma turma = new Turma(3,1,10);
        turmas.add(turma);
    }
    
    //Método utilizado para adicionar uma turma na lista de turmas cadstradas
    public void cadastrar(){
        //Pede os atributos da turma e armazena em variáveis
        System.out.println("Informe os dados da turma:");
        System.out.print("Serie: ");
        int serie = leitura.nextInt();
        System.out.print("Numero: ");
        int numero = leitura.nextInt();
        System.out.print("Capacidade maxima de alunos: ");
        int capacidade = leitura.nextInt();
        System.out.println();
        
        //Passa as variáveis como parâmetros da criação do objeto e adiciona ele na lista
        Turma turma = new Turma(serie,numero,capacidade);
        turmas.add(turma);
        
        System.out.println("Turma criada!");
    }
    
    //Método utilizado para mostrar ao usuário a lista das turmas cadastradas
    public void visualizar() {
        System.out.println("Lista de turmas cadastradas:");
        //Laço de repetição que irá percorrer toda a lista
        for (int i = 0; i < turmas.size(); i++) {
            Turma turma = turmas.get(i);
            System.out.println("Indice: " + i);
            System.out.println("Serie: " + turma.getSerie());
            System.out.println("Numero: " + turma.getNumero());
            System.out.println("Capacidade maxima: " + turma.getCapacidade());
            System.out.println();
        }
    }
    
    //Método utilizado para editar os dados de uma turma, passado seu índice
    public void alterar() {
        System.out.print("Digite o índice da Turma a ser alterada: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        //Verifica se o índice está dentro da lista
        if (indice >= 0 && indice < turmas.size()) {
            Turma turma = turmas.get(indice);

            //Recebe os novos dados da turma e salva em variáveis
            System.out.println("Informe os novos dados da turma:");
            System.out.print("Serie: ");
            int serie = leitura.nextInt();
            System.out.print("Numero: ");
            int numero = leitura.nextInt();
            System.out.print("Capacidade maxima de alunos: ");
            int capacidade = leitura.nextInt();
            System.out.println();
        
            //Atualiza os atributos por meio dos métodos mutantes
            turma.setSerie(serie);
            turma.setNumero(numero);
            turma.setCapacidade(capacidade);
        
            System.out.println("Turma alterada com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }    
    
    //Método utilizado para eliminar uma turma da lista, passado seu índice
    public void excluir() {
        System.out.print("Digite o índice da turma a ser excluída: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        //Verifica se o índice está na lista
        if (indice >= 0 && indice < turmas.size()) {
            turmas.remove(indice);
            System.out.println("Turma excluída com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
