package Aula_22.exemploExcecoes;

public class Operacoes3 {
    public int divide(int n1, int n2)throws ArithmeticException{ //pode lançar
        if (n2==0){
            throw new ArithmeticException("Não pode dividir por zero!");// está lançando (diferença do 's');
        }
        return n1/n2;
    }
}
