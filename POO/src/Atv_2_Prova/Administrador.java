package Atv_2_Prova;

//Criando uma de quatro classes obrigatórias, herdando classe mãe
public class Administrador extends Funcionario{

    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    //Implementando métodos
    @Override
    public void exibirCargo() {
        System.out.println("Administrador");
    }

    @Override
    public void calcularBonus() {
        System.out.println("bônus de 10%");
    }
}