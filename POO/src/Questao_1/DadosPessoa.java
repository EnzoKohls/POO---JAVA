package Questao_1;

import java.util.Scanner;

public class DadosPessoa {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        System.out.println("Nome do aluno 1: ");
        pessoa1.setNome(sc.next());
        System.out.println("Idade aluno 1: ");
        pessoa1.setIdade(sc.nextInt());

        System.out.println("Nome do aluno 2: ");
        pessoa2.setNome(sc.next());
        System.out.println("Idade aluno 2: ");
        pessoa2.setIdade(sc.nextInt());

        System.out.println("Nome do aluno 3: ");
        pessoa3.setNome(sc.next());
        System.out.println("Idade aluno 3: ");
        pessoa3.setIdade(sc.nextInt());

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());

    }
}