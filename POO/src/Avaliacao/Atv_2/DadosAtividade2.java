package Avaliacao.Atv_2;

import java.util.Scanner;

public class DadosAtividade2 {
    //criacao do Scanner
    static Scanner sc = new Scanner(System.in);

    //criacao do main
    public static void main(String[] args) {

        //criacao dos "Usuarios"
        Atividade2 atividade1 = new Atividade2();
        Atividade2 atividade2 = new Atividade2();
        Atividade2 atividade3 = new Atividade2();
        Atividade2 atividade4 = new Atividade2();

        //criacao dos Objetos e Dados
        System.out.println("Nome do 1° cliente: ");
        atividade1.setNomeCompleto(sc.next());
        System.out.println("CPF do 1° cliente: ");
        atividade1.setCPF(sc.nextFloat());
        System.out.println("E-mail do 1° cliente: ");
        atividade1.setEmail(sc.next());

        //criacao do if para dados incorretos
        if (atividade1.getCPF() < 15) {
            throw new IllegalArgumentException("Valor de CPF inválido");
        }
        if (atividade1.getCPF() > 13) {
            throw new IllegalArgumentException("Valor de CPF inválido");
        }

        System.out.println("Nome do 2° cliente: ");
        atividade2.setNomeCompleto(sc.next());
        System.out.println("CPF do 2° cliente: ");
        atividade2.setCPF(sc.nextFloat());
        System.out.println("E-mail do 2° cliente: ");
        atividade2.setEmail(sc.next());

        if (atividade2.getCPF() < 14) {
            throw new IllegalArgumentException("Valor de CPF inválido");
        }
        if (atividade2.getCPF() > 14) {
            throw new IllegalArgumentException("Valor de CPF inválido");
        }

        System.out.println("Nome do 3° cliente: ");
        atividade3.setNomeCompleto(sc.next());
        System.out.println("CPF do 3° cliente: ");
        atividade3.setCPF(sc.nextFloat());
        System.out.println("E-mail do 3° cliente: ");
        atividade3.setEmail(sc.next());

        if (atividade3.getCPF() < 14) {
            throw new IllegalArgumentException("Valor de CPF inválido");
        }
        if (atividade3.getCPF() > 14) {
            throw new IllegalArgumentException("Valor de CPF inválido");
        }

        System.out.println("Nome do 4° cliente: ");
        atividade4.setNomeCompleto(sc.next());
        System.out.println("CPF do 4° cliente: ");
        atividade4.setCPF(sc.nextFloat());
        System.out.println("E-mail do 4° cliente: ");
        atividade4.setEmail(sc.next());

        if (atividade4.getCPF() < 14) {
            throw new IllegalArgumentException("Valor de CPF inválido");
        }
        if (atividade4.getCPF() > 14) {
            throw new IllegalArgumentException("Valor de CPF inválido");
        }

        //criacao da print
        System.out.println(atividade1.toString());
        System.out.println(atividade2.toString());
        System.out.println(atividade3.toString());
        System.out.println(atividade4.toString());

    }
}
