package crudescola;

import java.util.ArrayList; //Importando a classe ArrayList para que o programa tenha suporte a listas
import java.util.Scanner; // Importando a classe Scanner para que o programa tenha suporte a entrada de dados

//Classe com implementação das funções CRUD dos alunos
public class GerenciadorAlunos {
    //Atributos
    private ArrayList<Aluno> alunos;
    private Scanner leitura;

    //Método construtor, escrito de forma que já exista um aluno ao iniciar o programa
    public GerenciadorAlunos() {
        //Inicializa a lista dos alunos
        alunos = new ArrayList();
        leitura = new Scanner(System.in);
        
        Aluno aluno = new Aluno("Italo Freitas","1234",15,1);
        alunos.add(aluno);
    }
    
    //Método utilizado para adicionar um aluno na lista de alunos matriculados
    public void cadAluno(){
        //Solicita os atributos do aluno e salva em variáveis
        System.out.println("Informe os dados do aluno:");
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Matricula: ");
        String matricula = leitura.nextLine();
        System.out.print("Idade: ");
        int idade = leitura.nextInt();
        System.out.print("Turma: ");
        int turma = leitura.nextInt();
        System.out.println();
        
        //Passa as variáveis como parâmetro na criação do objeto e o adiciona na lista
        Aluno aluno = new Aluno(nome,matricula,idade,turma);
        alunos.add(aluno);
        
        System.out.println("Aluno matriculado!");
    }
    
    //Método utilizado para mostrar ao usuário a lista de alunos matriculados
    public void lerAlunos() {
        System.out.println("Lista de alunos matriculados:");
        //Laço de repetição que percorre toda a lista
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Indice: " + i);
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Turma: " + aluno.getTurma());
            System.out.println();
        }
    }
    
    //Método utilizado para editar os dados de um aluno passado seu índice
    public void alterarAluno() {
        System.out.print("Digite o índice do aluno a ser alterado: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        //Verifica se o índice está na lista
        if (indice >= 0 && indice < alunos.size()) {
            Aluno aluno = alunos.get(indice);

            //Pede os novos dados do aluno
            System.out.println("Informe os dados novos do aluno:");
            System.out.print("Nome: ");
            String nome = leitura.nextLine();
            System.out.print("Matricula: ");
            String matricula = leitura.nextLine();
            System.out.print("Idade: ");
            int idade = leitura.nextInt();
            System.out.print("Turma: ");
            int turma = leitura.nextInt();
            leitura.nextLine();

            //Atualiza os atributos do objeto
            aluno.setNome(nome);
            aluno.setMatricula(matricula);
            aluno.setIdade(idade);
            aluno.setTurma(turma);

            System.out.println("Aluno alterado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }    
    
    //Método utilizado para eliminar um aluno da lista de alunos matriculados
    public void excluirAluno() {
        System.out.print("Digite o índice do aluno a ser excluído: ");
        int indice = leitura.nextInt();
        leitura.nextLine();

        //Verifica se o índice está dentro da lista
        if (indice >= 0 && indice < alunos.size()) {
            alunos.remove(indice);
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
