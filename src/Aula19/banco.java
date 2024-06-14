package Aula19;

import java.util.Random;
import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        conta conta = new conta();
        char opc2;
        do {
            System.out.println("-----------------------");
            System.out.println("Selecione uma opção: ");
            System.out.println(" c -> Criar conta");
            System.out.println(" e -> Entrar na conta");
            System.out.println(" s -> Sair");
            System.out.println("------------------------");
            opc2 = ler.next().toLowerCase().charAt(0);

            switch(opc2) {
                case 'c' -> {
                    System.out.println("Banco");
                    System.out.print("Digite o nome do titular da conta: ");
                    String titular = ler.next();
                    System.out.println("Qual o deposito inicial: ");
                    float valor = ler.nextFloat();
                    System.out.print("Digite a sua senha da conta: ");
                    String senha = ler.next();
                    conta.titular = titular;
                    conta.identificador = "conta" + new Random().nextInt(1000, 10000);
                    conta.depositar(valor);
                    conta.senha = senha;
                    System.out.println("Conta cadastrada obteve o id: " + conta.identificador);
                }

                case 'e' -> {
                    //acessando a conta
                    System.out.println("Digite a senha: ");
                    String senha = ler.next();
                    System.out.println("Digite o identificador: ");
                    String identificador = ler.next();
                    conta.senha = senha;
                    conta.identificador = identificador;

                    if (conta.validarAcesso(identificador, senha)) {
                        char opc;

                        do {
                            System.out.println("Selecione uma opção: ");
                            System.out.println(" v - verificar saldo");
                            System.out.println(" d - depositar");
                            System.out.println(" s- sacar");
                            System.out.println(" e - sair");
                            opc = ler.next().toLowerCase().charAt(0);

                            switch (opc) {
                                case 'v' -> System.out.println(conta.saldo());
                                case 'd' -> {
                                    System.out.println("Qual valor deseja depositar: ");
                                    float valor = ler.nextFloat();
                                    conta.depositar(valor);
                                    System.out.println("Deposito Realizado!");
                                }
                                case 's' -> {
                                    System.out.println("Qual valor deseja depositar: ");
                                    float valor = ler.nextFloat();
                                    if (conta.sacar(valor)) {
                                        System.out.println("Saque realizado!");
                                    } else
                                        System.out.println("Saldo insuficiente!");
                                }
                            }
                        }
                        while (opc != 'e');
                    }
                }
            }
        } while (opc2 != 'e');
    }
}