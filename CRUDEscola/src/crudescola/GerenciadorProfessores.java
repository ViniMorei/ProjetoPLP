package crudescola;

import java.util.ArrayList; //Importando a classe ArrayList para que o programa tenha suporte a listas
import java.util.Scanner; //Importando a classe Scanner para que o programa tenha suporte a entrada de dados

//Classe com as funções do CRUD do professor
public class GerenciadorProfessores {
    //Atributos
    private ArrayList<Professor> professores;
    private Scanner leitura;

    //Método construtor, escrito de maneira com que já exista um professor ao iniciar o programa
    public GerenciadorProfessores() {
        //Inicializa a lista dos professores
        professores = new ArrayList();
        leitura = new Scanner(System.in);
        
        Professor professor = new Professor("Maximus Saulo","000","Engenharia de Software",5000,
                                    40,"Logica de Programacao");
        professores.add(professor);
    }
    
    //Método utilizado para adicionar um professor na lista de professores cadastrados
    public void cadProfessor(){
        //Recebe os atributos do objeto professor por input
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
        
        //Passa as variáveis recebidas como parâmetros no método construtor e adiciona o objeto na lista
        Professor professor = new Professor(nome,cpf,form,sal,carga,disc);
        professores.add(professor);
        
        System.out.println("Professor cadastrado!");
    }
    
    //Método utilizado para mostrar a lista dos professores cadastrados ao usuário
    public void lerProfessores() {
        System.out.println("Lista de professores cadastrados:");
        //Laço de repetição que irá percorrer toda a lista
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
    
    //Método utilizado para editar os dados de um professor, passado o índice do mesmo
    public void alterarProfessor() {
        System.out.print("Digite o índice do professor a ser alterado: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        //Verifica se o índice está dentro da lista
        if (indice >= 0 && indice < professores.size()) {
            Professor professor = professores.get(indice);

            //Recebe os novos atributos
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

            //Atualiza os atributos
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
    
    //Método utilizado para tirar um professor da lista, passado o índice do mesmo
    public void excluirProfessor() {
        System.out.print("Digite o índice do professor a ser excluído: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        //Verifica se o índice está dentro da lista
        if (indice >= 0 && indice < professores.size()) {
            professores.remove(indice);
            System.out.println("Professor excluído com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
