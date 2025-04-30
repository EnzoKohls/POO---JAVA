package Estudo_Casa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            alunos[i] = new Aluno(nome, matricula, idade);
            System.out.println();
        }

        System.out.println("----- Apresentação dos Alunos -----");

        for (Aluno aluno : alunos) {
            aluno.apresentar();
        }

        scanner.close();
    }
}
