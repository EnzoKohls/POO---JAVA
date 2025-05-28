package Atv_1;

public class Gerente extends Funcionario {
     int projetosGerenciados;

    public Gerente (String nome, double salarioBase, int projetosGerenciados) {
        super(nome, salarioBase);
        this.projetosGerenciados = projetosGerenciados;
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.15;
    }


}
