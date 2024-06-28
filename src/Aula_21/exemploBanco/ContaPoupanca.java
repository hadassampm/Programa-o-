package Aula_21.exemploBanco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String Titular, String Senha, float deposito) {
        super(Titular, Senha);
        Saldo = deposito;
    }
    public boolean sacar (float valor){
        if(valor <= Saldo){
            Saldo -= valor;
            return true;
        }
        return false;
    }
    public String verificaSaldo(){
        return String.format("Seu saldo atual é de R$%.2f", Saldo);
        //return "Saldo: "+Saldo;
    }
}
