package Aula_22.exemploPolimorfismo;

public class Principal {
    public static void main (String[] args){
        Pessoa1 p1= new Pessoa1();

        p1.setNome("Jonas");
        p1.setSobrenome("Silva");

        Aluno1 a1 = new Aluno1();
        a1.setNome("Ana");
        a1.setSobrenome("Silva");
        a1.setMatricula("a1234");

        System.out.println(p1.obterDados());
        System.out.println(a1.obterDados());
        System.out.println(p1);
        System.out.println(a1);
    }
}
