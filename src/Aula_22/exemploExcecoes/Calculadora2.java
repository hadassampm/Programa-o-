package Aula_22.exemploExcecoes;

public class Calculadora2 {
    public static void main (String[] args){
        Operacoes3 op = new Operacoes3();
        try{
            System.out.println(op.divide(5,0));
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
