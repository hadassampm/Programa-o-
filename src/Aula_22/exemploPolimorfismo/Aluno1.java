package Aula_22.exemploPolimorfismo;

public class Aluno1 extends Pessoa1{
    public String matricula;

    public String getMatricula() {return matricula;}

    public void setMatricula(String matricula) {this.matricula=matricula;}

    public String obterDados(){
        return "Nome: "+getNome()+"sobrenome: "+getSobrenome()+" matricula: "+matricula;
    }
}

