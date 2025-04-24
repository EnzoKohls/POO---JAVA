package Avaliacao.Atv_1;

public class Atividade1 {
    //criacao da classe e atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    Atividade1 (String nome, double preco, int quantidadeEstoque) {
        // atributo se torna parâmetro
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    Atividade1 () {

    }

    //criacao do Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //criacao do toString

    @Override
    public String toString() {
        return "Atividade1{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
