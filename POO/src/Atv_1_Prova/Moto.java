package Atv_1_Prova;

//Criando uma de quatro classes obrigatórias, herdando classe mãe
public class Moto extends Transporte{

    public Moto(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    //Implementando métodos
    @Override
    public void mover() {
        System.out.println("A moto está andando");
    }

    @Override
    public void parar() {
        System.out.println("A moto está parada");

    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
