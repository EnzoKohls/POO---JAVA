package Atv_1;

public class Desenvolvedor extends Funcionario{
    String linguagemPreferida;

    public Desenvolvedor (String nome, double salarioBase, String linguagemPreferida) {
        super(nome, salarioBase);
        this.linguagemPreferida = linguagemPreferida;
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }
}
