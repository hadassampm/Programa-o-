package Aula_22.exemploPolimorfismo;

import Aula_22.exemploFinal.Operacoes;

public class Teste {
    public static void main (String[] args){
        Operacoes2 op = new Operacoes2();
        System.out.println("Somando dois numeros "+op.soma(5,7));
        System.out.println("Somando três numeros "+op.soma(7, 2, 1));
        System.out.println("Somando duas String "+op.soma("Palavra", "Teste"));
    }
}
