package Atv_1_Prova;

//Criando uma de quatro classes obrigatórias, herdando classe mãe
public class Bicicleta extends Transporte{

    public Bicicleta(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    //Implementando métodos
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta está parada");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
