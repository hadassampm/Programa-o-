package Aula_20.exemploStatic.exemploHeranca;

public class Motorista extends Funcionario{

    public Motorista(String nome, String sobrenome, int matricula){
      super(nome,sobrenome,matricula);
    }
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
