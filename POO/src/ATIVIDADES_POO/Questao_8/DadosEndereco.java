package ATIVIDADES_POO.Questao_8;

import java.util.Scanner;

public class DadosEndereco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco();
        Endereco endereco3 = new Endereco();
        Endereco endereco4 = new Endereco();

        System.out.println("Rua da 1 pessoa: ");
        endereco1.setRua(sc.next());
        System.out.println("Número da casa da 1 pessoa: ");
        endereco1.setNumero(sc.nextInt());
        System.out.println("Cidade da 1 pessoa: ");
        endereco1.setCidade(sc.next());

        System.out.println("Rua da 2 pessoa: ");
        endereco2.setRua(sc.next());
        System.out.println("Número da casa da 2 pessoa: ");
        endereco2.setNumero(sc.nextInt());
        System.out.println("Cidade da 2 pessoa: ");
        endereco2.setCidade(sc.next());

        System.out.println("Rua da 3 pessoa: ");
        endereco3.setRua(sc.next());
        System.out.println("Número da casa da 3 pessoa: ");
        endereco3.setNumero(sc.nextInt());
        System.out.println("Cidade da 3 pessoa: ");
        endereco3.setCidade(sc.next());

        System.out.println("Rua da 4 pessoa: ");
        endereco4.setRua(sc.next());
        System.out.println("Número da casa da 4 pessoa: ");
        endereco4.setNumero(sc.nextInt());
        System.out.println("Cidade da 4 pessoa: ");
        endereco4.setCidade(sc.next());

        System.out.println(endereco1.toString());
        System.out.println(endereco2.toString());
        System.out.println(endereco3.toString());
        System.out.println(endereco4.toString());

    }
}
