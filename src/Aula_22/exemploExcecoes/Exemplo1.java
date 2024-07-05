package Aula_22.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        try{
            System.out.println("Digite um numero: ");
            int n1 = ler.nextInt();
            System.out.println("Digite outro numero: ");
            int n2 = ler.nextInt();
            int resultado = n1 / n2;
            System.out.println(resultado);
        }
        catch (InputMismatchException erro){
            System.out.println("n1 e n2 precisam ser numeros!");
            //erro.printStackTrace();
        }
        catch (ArithmeticException erro){
            System.out.println("Não é possivel dividir por zero!");
        }
    }
}
