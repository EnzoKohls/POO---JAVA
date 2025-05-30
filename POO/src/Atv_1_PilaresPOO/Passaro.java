package Atv_1_PilaresPOO;

public class Passaro extends Animal {
    private String corPenas;

    public Passaro(String nome, int idade, String corPenas) {
        super(nome, idade);
        this.corPenas = corPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu!");
    }

    @Override
    public void comer() {
        System.out.println("O pássaro está comendo sementes.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Pássaro: " + getNome() + ", Idade: " + getIdade() + ", Cor das penas: " + corPenas);
    }
}
