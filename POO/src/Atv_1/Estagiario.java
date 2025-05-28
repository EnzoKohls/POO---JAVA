package Atv_1;

public class Estagiario extends Funcionario{
    int horasEstagio;

    public Estagiario (String nome, double salarioBase, int horasEstagio) {
        super(nome, salarioBase);
        this.horasEstagio = horasEstagio;
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.05;
    }
}
