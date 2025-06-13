package Atv_1_Prova;

//Criando uma de quatro classes obrigatórias, herdando classe mãe
public class Onibus extends Transporte{

    public Onibus(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    //Implementando métodos
    @Override
    public void mover() {

    }

    @Override
    public void parar() {

    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
}
