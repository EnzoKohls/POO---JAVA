package Avaliacao.Atv_3;

public class Atividade3 {
    //criacao da classe e atributos
    private String nome;
    private int matricula;
    private double salario;

    Atividade3 (String nome, int matricula, double salario) {
        // atributo se torna parâmetro
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    Atividade3 () {

    }

    //criacao do Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //criacao do toString

    @Override
    public String toString() {
        return "Atividade3{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
