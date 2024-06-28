package Aula_20.exemploStatic;

public class Principal {
    public static void main(String[] args){
        Conta c1 = new Conta("Ana", "123", 10);
        System.out.println("Conta cadastrada com 10: "+c1.identificador);
        Conta c2 = new Conta("José", "345", 100);
        System.out.println("Conta cadastrada com 10: "+c2.identificador);
        //testando o atributo estatico.
        c1.nomeBanco = "Banco CIMOL";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);
        // acesso diretamente pela classe, ja que é um atributo estatico
        Conta.nomeBanco = "teste";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);
    }
}
