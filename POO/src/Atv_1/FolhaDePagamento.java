package Atv_1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FolhaDePagamento {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Enzo", 10000, 5));
        funcionarios.add(new Desenvolvedor("Eluan", 8000, "Java"));
        funcionarios.add(new Estagiario("Davi", 3000, 20));

        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.nome);
            System.out.println("Bônus: R$ " + f.calcularBonus());
            System.out.println("----------------------------");
        }
    }
}