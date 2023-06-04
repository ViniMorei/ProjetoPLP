package crudescola;

//Subclasse de funcionário

public class Professor extends Funcionario{
    private  int cargaHoraria;
    private  String disciplina;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    

    public Professor(String nome, String cpf, String formacao, float salario, int cargaHoraria, String disciplina) {
        super(nome, cpf, formacao, salario);
        this.cargaHoraria = cargaHoraria;
        this.disciplina = disciplina;
    }
     
}
