package Atv_1;

import java.util.Scanner;

public class DadosAtividade1 {
    //criacao do Scanner
    static Scanner sc = new Scanner(System.in);

    //criacao do main
    public static void main(String[] args) {

        //criacao dos "Usuarios"
        Atividade1 atividade1 = new Atividade1();
        Atividade1 atividade2 = new Atividade1();

        //criacao dos Objetos e Dados
        System.out.println("Nome do 1° produto: ");
        atividade1.setNome(sc.next());
        System.out.println("Preço do 1° produto: ");
        atividade1.setPreco(sc.nextDouble());
        System.out.println("Quantidade em estoque do 1° produto: ");
        atividade1.setQuantidadeEstoque(sc.nextInt());

        //criacao do if para dados incorretos
        if (atividade1.getPreco() < 0) {
            throw new IllegalArgumentException("Valor não deve ser negativo");
        }
        if (atividade1.getQuantidadeEstoque() < 1) {
            throw new IllegalArgumentException("Sem estoque");
        }

        System.out.println("Nome do 2° produto: ");
        atividade2.setNome(sc.next());
        System.out.println("Preço do 2° produto: ");
        atividade2.setPreco(sc.nextDouble());
        System.out.println("Quantidade em estoque do 2° produto: ");
        atividade2.setQuantidadeEstoque(sc.nextInt());

        if (atividade2.getPreco() < 0) {
            throw new IllegalArgumentException("Valor não deve ser negativo");
        }
        if (atividade2.getQuantidadeEstoque() < 1) {
            throw new IllegalArgumentException("Sem estoque");
        }

        //criacao da print
        System.out.println(atividade1.toString());
        System.out.println(atividade2.toString());
    }
}
