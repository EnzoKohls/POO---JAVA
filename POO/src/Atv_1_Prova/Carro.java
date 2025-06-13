package Atv_1_Prova;

 //Criando uma de quatro classes obrigatórias, herdando classe mãe
public class Carro extends Transporte{

    public Carro(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

     //Implementando métodos
    @Override
    public void parar() {
        System.out.println("O carro está parado");
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
