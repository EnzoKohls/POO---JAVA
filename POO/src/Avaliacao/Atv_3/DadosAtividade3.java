package Avaliacao.Atv_3;

import java.util.Scanner;

public class DadosAtividade3 {
    //criacao do Scanner
    static Scanner sc = new Scanner(System.in);

    //criacao do main
    public static void main(String[] args) {



        //criacao dos "Usuarios"
        Atividade3 atividade1 = new Atividade3();
        Atividade3 atividade2 = new Atividade3();

        //criacao dos Objetos e Dados
        System.out.println("Nome do 1° funcionario: ");
        atividade1.setNome(sc.next());
        System.out.println("Matrícula do 1° funcionario: ");
        atividade1.setMatricula(sc.nextInt());
        System.out.println("Salário do 1° funcionario: ");
        atividade1.setSalario(sc.nextDouble());

        //criacao do if para dados incorretos
        if (atividade1.getMatricula() <= 0) {
            throw new IllegalArgumentException("A matrícula deve ser maior que zero");
        }
        if (atividade1.getSalario() < 1200) {
            throw new IllegalArgumentException("O salário não deve ser inferior a 1,200");
        }

        System.out.println("Nome do 2° funcionario: ");
        atividade2.setNome(sc.next());
        System.out.println("Matrícula do 2° funcionario: ");
        atividade2.setMatricula(sc.nextInt());
        System.out.println("Salário do 2° funcionario: ");
        atividade2.setSalario(sc.nextDouble());

        if (atividade2.getMatricula() <= 0) {
            throw new IllegalArgumentException("A matrícula deve ser maior que zero");
        }
        if (atividade2.getSalario() < 1200) {
            throw new IllegalArgumentException("O salário não deve ser inferior a 1,200");
        }

        //criacao da print
        System.out.println(atividade1.toString());
        System.out.println(atividade2.toString());
    }
}
