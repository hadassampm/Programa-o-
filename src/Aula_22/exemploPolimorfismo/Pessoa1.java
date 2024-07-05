package Aula_22.exemploPolimorfismo;

public class Pessoa1 {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //@Override
    // tem um metodo na classe principal e um metodo na classe herdada,
    // sobescreve o metodo da classe principal
    public String obterDados(){
        return "Nome: "+nome+" Sobrenome: "+sobrenome;
    }
}

   // @Override public String toString(){
      //  String nome;
        //return "Nome: "+nome+" Sobrenome: "+sobrenome;
  //  }
