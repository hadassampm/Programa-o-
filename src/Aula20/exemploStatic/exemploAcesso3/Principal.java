package Aula20.exemploStatic.exemploAcesso3;

public class Principal {
    public static void main(String[] args){
        Conta c1 = new Aula20.exemploStatic.exemploAcesso3.Conta("Ana", "123", 10);
        System.out.println("Conta cadastrada com 10: "+ c1.getIdentificador());
        Aula20.exemploStatic.exemploAcesso3.Conta c2 = new Aula20.exemploStatic.exemploAcesso3.Conta("José", "345", 100);
        System.out.println("Conta cadastrada com 10: "+c2.getIdentificador());
        c1.depositar(100);
        c1.sacar(10);
        //não é possivel acessar o atributo saldo diretamente
        //c1.saldo = 0;
        System.out.println(c1.saldo());
    }
}
