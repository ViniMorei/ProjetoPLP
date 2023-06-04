package crudescola;

public class Turma {
    private int serie, numero, capacidade;

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

    public Turma(int serie, int numero, int capacidade) {
        this.serie = serie;
        this.numero = numero;
        this.capacidade = capacidade;
    }
    
    
}
