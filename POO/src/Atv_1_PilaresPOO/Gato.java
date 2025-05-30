package Atv_1_PilaresPOO;

public class Gato extends Animal{
    private String corPelo;

    public Gato (String nome, int idade, String corPelo){
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void comer() {
        System.out.println("O gato está comendo peixe");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Gato: " + getNome() + ", Idade: " + getIdade() + ", Cor do pelo: " + corPelo);
    }
}
