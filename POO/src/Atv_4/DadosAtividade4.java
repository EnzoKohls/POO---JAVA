package Atv_4;

import java.util.Scanner;

public class DadosAtividade4 {
    //criacao do Scanner
    static Scanner sc = new Scanner(System.in);

    //criacao do main
    public static void main(String[] args) {

        //criacao dos "Usuarios"
        Atividade4 atividade1 = new Atividade4();
        Atividade4 atividade2 = new Atividade4();
        Atividade4 atividade3 = new Atividade4();

        //criacao dos Objetos e Dados
        System.out.println("Nome do 1° aluno: ");
        atividade1.setNome(sc.next());
        System.out.println("Idade do 1° aluno: ");
        atividade1.setIdade(sc.nextInt());
        System.out.println("Nota final do 1° aluno: ");
        atividade1.setNotaFinal(sc.nextDouble());

        //criacao do if para dados incorretos
        if (atividade1.getIdade() < 14) {
            throw new IllegalArgumentException("a idade deve ser maior que 14");
        }
        if (atividade1.getNotaFinal() < 0) {
            throw new IllegalArgumentException("A nota está inválida");
        }
        if (atividade1.getNotaFinal() > 10) {
            throw new IllegalArgumentException("A nota está inválida");
        }

        System.out.println("Nome do 2° aluno: ");
        atividade2.setNome(sc.next());
        System.out.println("Idade do 2° aluno: ");
        atividade2.setIdade(sc.nextInt());
        System.out.println("Nota final do 2° aluno: ");
        atividade2.setNotaFinal(sc.nextDouble());

        if (atividade2.getIdade() < 14) {
            throw new IllegalArgumentException("a idade deve ser maior que 14");
        }
        if (atividade2.getNotaFinal() < 0) {
            throw new IllegalArgumentException("A nota está inválida");
        }
        if (atividade2.getNotaFinal() > 10) {
            throw new IllegalArgumentException("A nota está inválida");
        }

        System.out.println("Nome do 3° aluno: ");
        atividade3.setNome(sc.next());
        System.out.println("Idade do 3° aluno: ");
        atividade3.setIdade(sc.nextInt());
        System.out.println("Nota final do 3° aluno: ");
        atividade3.setNotaFinal(sc.nextDouble());

        if (atividade3.getIdade() < 14) {
            throw new IllegalArgumentException("a idade deve ser maior que 14");
        }
        if (atividade3.getNotaFinal() < 0) {
            throw new IllegalArgumentException("A nota está inválida");
        }
        if (atividade3.getNotaFinal() > 10) {
            throw new IllegalArgumentException("A nota está inválida");
        }

        //criacao da print
        System.out.println(atividade1.toString());
        System.out.println(atividade2.toString());
        System.out.println(atividade3.toString());
    }
}
