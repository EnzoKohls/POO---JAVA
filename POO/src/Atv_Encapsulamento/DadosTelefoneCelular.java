package Atv_Encapsulamento;

import java.util.Scanner;

public class DadosTelefoneCelular {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        TelefoneCelular telefoneCelular = new TelefoneCelular();

        System.out.println("Informe a marca do telefone/celular: ");
        telefoneCelular.setMarca(sc.nextLine());
        System.out.println("Informe a cor do telefone/celular: ");
        telefoneCelular.setCor(sc.nextLine());
        System.out.println("Informe o modelo do telefone/celular: ");
        telefoneCelular.setModelo(sc.nextLine());
        System.out.println("Informe o armazenamento do telefone/celular: ");
        telefoneCelular.setArmazenamento(sc.nextInt());

        System.out.println("---------Dados do Telefone/Celular---------");

        System.out.println(telefoneCelular.toString());
    }
}