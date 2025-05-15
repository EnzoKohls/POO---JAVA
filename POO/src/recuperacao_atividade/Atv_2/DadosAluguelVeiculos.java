package recuperacao_atividade.Atv_2;

import java.util.Scanner;

public class DadosAluguelVeiculos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Criando os objeto da classe
        AluguelVeiculos aluguelVeiculos1 = new AluguelVeiculos();
        AluguelVeiculos aluguelVeiculos2 = new AluguelVeiculos();

        // Definindo valores
        System.out.println("Informe o modelo do veiculo: ");
        aluguelVeiculos1.setModeloVeiculo(sc.next());
        System.out.println("Informe a placa do veiculo: ");
        aluguelVeiculos1.setPlaca(sc.next());
        System.out.println("Informe a quilometragem do veiculo: ");
        aluguelVeiculos1.setQuilometragem(sc.nextInt());

        // Codigo de erro para valor inválido
        if (aluguelVeiculos1.getQuilometragem() < 0) {
            throw new IllegalArgumentException("Valor de quilometragem inválido, quilometragem negativa");
        }

        System.out.println("Informe o modelo do veiculo: ");
        aluguelVeiculos2.setModeloVeiculo(sc.next());
        System.out.println("Informe a placa do veiculo: ");
        aluguelVeiculos2.setPlaca(sc.next());
        System.out.println("Informe a quilometragem do veiculo: ");
        aluguelVeiculos2.setQuilometragem(sc.nextInt());

        if (aluguelVeiculos2.getQuilometragem() < 0) {
            throw new IllegalArgumentException("Valor de quilometragem inválido, quilometragem negativa");
        }

        // Exibir os dados
        System.out.println(aluguelVeiculos1.toString());
        System.out.println(aluguelVeiculos2.toString());
    }
}
