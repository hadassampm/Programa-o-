package Aula_20.exemploStatic.exemploHeranca;

public class Principal {
    public static void main(String[] args){

        Motorista m1 = new Motorista("João","Silva",123);
        m1.setNome("João");
        m1.setSobrenome("Silva");
        m1.setMatricula(123);
        m1.setSalario(1200);
        m1.setCnh("9653862809");

        System.out.println("Nome do motorista: "+m1.getNome()+" "+m1.getSobrenome());
        System.out.println("Recebe: "+String.format("%.2f", m1.getSalario()));

        Engenheiro e1 = new Engenheiro("Mauricio", "Santos", 432);
        e1.setNome("Mauricio");
        e1.setSobrenome("Santos");
        e1.setMatricula(432);
        e1.setSalario(2700);

        System.out.println("Nome do engenheiro: "+e1.getNome()+" "+e1.getSobrenome());
        System.out.println("Recebe: "+String.format("%.2f", e1.getSalario()));
    }
}
