package crudescola;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class CRUDEscola {

    public static void main(String[] args) {
       /*GerenciadorProfessores professores = new GerenciadorProfessores();
       professores.cadProfessor();
       professores.cadProfessor();
       professores.lerProfessores();
       professores.alterarProfessor();
       professores.lerProfessores();*/
       
       GerenciadorDiretor diretor = new GerenciadorDiretor();
       diretor.cadDiretor();
       diretor.lerDiretor();
       diretor.alterarDiretor();
       diretor.lerDiretor();
       
    }
}
