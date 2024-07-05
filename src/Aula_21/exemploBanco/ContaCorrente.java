package Aula_21.exemploBanco;

public class ContaCorrente extends Conta{
    private float limite;
    public ContaCorrente(String titular, String senha, float limite) {
        super(titular, senha);
        this.limite = limite;
    }

    public boolean sacar (float valor){
        if(valor <= saldo + limite){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public String verificaSaldo(){

        String retorno = String.format("Seu saldo é de R$%.2f\n", saldo);
        //return "Saldo: "+Saldo+" , limite: "+limite;
        if (saldo >= 0)
            retorno += String.format("Limite disponivel %.2f", limite);
        else
            retorno += String.format("Limite disponivel %.2f", limite+saldo);
        return retorno;
        }
    }

