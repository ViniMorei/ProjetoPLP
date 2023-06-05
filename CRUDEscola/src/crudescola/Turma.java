package crudescola;

//Classe turma
public class Turma {
    //Atributos
    private int serie, numero, capacidade;

    //Método construtor
    public Turma(int serie, int numero, int capacidade) {
        this.serie = serie;
        this.numero = numero;
        this.capacidade = capacidade;
    }
    
    //Métodos acessores e mutantes
    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
}
