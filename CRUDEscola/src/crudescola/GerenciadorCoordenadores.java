package crudescola;

import java.util.ArrayList; //Importando a classe ArrayList para que o porgrama tenha suporte a listas
import java.util.Scanner; //Importando a classe Scanner para que o programa tenha suporte a entrada de dados

//Classe com implementações das funções de CRUD de coordenador
public class GerenciadorCoordenadores {
    //Atributos
    private ArrayList<Coordenador> coordenadores;
    private Scanner leitura;

    //Método construtor, escrito de forma que já tenham coordenadores cadstrados ao iniciar o programa
    public GerenciadorCoordenadores() {
        //Inicializa a lista dos coordenadores
        coordenadores = new ArrayList(); 
        leitura = new Scanner(System.in);
        
        Coordenador vini = new Coordenador("Vinicius Moreira", "333", "Letras",4000);
        coordenadores.add(vini);
        Coordenador matheus = new Coordenador("Matheus Andrade", "444", "Matematica",3000);
        coordenadores.add(matheus);
        Coordenador estefane = new Coordenador("Estefane Andrade", "555", "Historia",3000);
        coordenadores.add(estefane);
    }
    
    //Método utilizado para adicionar um coordenador na lista de coordenadores cadastrados
    public void cadastrar(){
        //Recebe os atributos do coordenador
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
        
        //Passa as variáveis recebidas como parâmetros e adiciona o objeto na lista
        Coordenador coordenador = new Coordenador(nome,cpf,form,sal);
        coordenadores.add(coordenador);
        
        System.out.println("Coordenador cadastrado!");
    }
    
    //Método utilizado para mostrar ao usuário a lista de coordenadores cadastrados
    public void visualizar() {
        System.out.println("Lista de coordenadores cadastrados:");
        //Laço de repetição que percorre toda a lista
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
    
    //Método utilizado para editar os dados de um determinado coordenador, passado o índice
    public void alterar() {
        System.out.print("Digite o índice do coordenador a ser alterado: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        //Verifica se o índice recebido está dentro da lista
        if (indice >= 0 && indice < coordenadores.size()) {
            Coordenador coordenador = coordenadores.get(indice);

            //Solicita os novos atributos do objeto
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

            //Atualiza os dados
            coordenador.setNome(nome);
            coordenador.setCpf(cpf);
            coordenador.setFormacao(form);
            coordenador.setSalario(sal);

            System.out.println("Coordenador alterado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }    
    
    //Método utilizado para eliminar um coordenador da lista de coordenadores cadastrados
    public void excluir() {
        System.out.print("Digite o índice do coordenador a ser excluído: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        //Verifica se o índice recebido está dentro da lista
        if (indice >= 0 && indice < coordenadores.size()) {
            coordenadores.remove(indice);
            System.out.println("Coordenador excluído com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
