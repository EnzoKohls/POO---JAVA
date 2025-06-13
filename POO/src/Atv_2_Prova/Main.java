
package Atv_2_Prova;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionario = new ArrayList<>();

        funcionario.add(new Administrador("Melissa", "99988877744", 10000));
        funcionario.add(new Desenvolvedor("Nicollete", "44455566699", 12000));
        funcionario.add(new SuporteTecnico("Tobi", "11122233377", 8000));

        for (Funcionario funcionario1 : funcionario) {
            funcionario.exibirCargo();
            funcionario.calcularBonus();
            funcionario1.exibirInformacoes();
            System.out.println("-----");
        }
    }
}
