package AtividadeCasa;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro (String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void comer() {
        System.out.println("O Chacorro come ração");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Viralata");
    }
}
