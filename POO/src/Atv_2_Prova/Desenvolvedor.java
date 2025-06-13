
package Atv_2_Prova;

//Criando uma de quatro classes obrigatórias, herdando classe mãe
public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    //Implementando métodos
    @Override
    public void exibirCargo() {
        System.out.println("Desenvolvedor");
    }

    @Override
    public void calcularBonus() {
        System.out.println("Bônus de 15%");
    }
}
