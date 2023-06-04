package crudescola;

//Classe abstrata
public abstract class Funcionario {
    //Atributos
    public String nome, cpf, formacao;
    public float salario;
    
    //Métodos
    public Funcionario(String nome, String cpf, String formacao, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.formacao = formacao;
        this.salario = salario;
    }

    
    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
