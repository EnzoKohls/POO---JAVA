package Questao_9;

import java.util.Scanner;

public class DadosContaBancaria {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        DadosContaBancaria dadosContaBancaria1 = new DadosContaBancaria();
        DadosContaBancaria dadosContaBancaria2 = new DadosContaBancaria();

        System.out.println("Nome do 1 animal: ");
        dadosContaBancaria1.(sc.next());
        System.out.println("Raça do 1 animal: ");
        dadosContaBancaria1.setRaca(sc.next());

        System.out.println("Nome do 1 animal: ");
        dadosContaBancaria2.setNome(sc.next());
        System.out.println("Raça do 1 animal: ");
        dadosContaBancaria2.setRaca(sc.next());

        System.out.println(dadosContaBancaria1.toString());
        System.out.println(dadosContaBancaria2.toString());

    }
}
