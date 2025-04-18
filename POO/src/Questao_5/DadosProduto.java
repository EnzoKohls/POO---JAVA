package Questao_5;

import AtividedeDeEstudo.Funcionario;

import java.util.Scanner;

public class DadosProduto {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        System.out.println("Nome produto 1: ");
        produto1.setNome(sc.next());
        System.out.println("Preço produto 1: ");
        produto1.setPreco(sc.nextInt());

        System.out.println("Nome produto 2: ");
        produto2.setNome(sc.next());
        System.out.println("Preço produto 2: ");
        produto2.setPreco(sc.nextInt());

        System.out.println(produto1.toString());
        System.out.println(produto2.toString());

    }
}
