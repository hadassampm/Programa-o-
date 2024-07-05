package Aula_22.exemploFinal;

public class Operacoes {
    //Atributo com o modificador final precisam ser inicializados , caso não
    //seja a inicialização deve ocorrer ate o final do construtor;
    final double valor;

    //Para criar uma constante ela deve ser estética e final ao mesmo tempo
    // acesso global -> public
    // disponivel diretamente na classe ->  static
    // inalterável -> final
    public static final double PI = 3.141592653589793;
    public Operacoes(){
        valor = 10;
    }


}
