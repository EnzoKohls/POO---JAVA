package Avaliacao.Atv_4;

public class Atividade4 {
    //criacao da classe e atributos
    private String nome;
    private int idade;
    private double notaFinal;

    Atividade4 (String nome, int idade, double notaFinal) {
        // atributo se torna parâmetro
        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }

    Atividade4 () {

    }

    //criacao do Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    //criacao do toString

    @Override
    public String toString() {
        return "Atividade4{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
