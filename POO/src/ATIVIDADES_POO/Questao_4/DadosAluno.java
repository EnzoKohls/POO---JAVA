package ATIVIDADES_POO.Questao_4;

import java.util.Scanner;

public class DadosAluno {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();

        System.out.println("Nome aluno 1: ");
        aluno1.setNome(sc.next());
        System.out.println("Matricula aluno 1: ");
        aluno1.setMatricula(sc.nextInt());
        System.out.println("Sua nota final aluno 1: ");
        aluno1.setNotaFinal(sc.nextInt());

        System.out.println("Nome aluno 1: ");
        aluno2.setNome(sc.next());
        System.out.println("Matricula aluno 2: ");
        aluno2.setMatricula(sc.nextInt());
        System.out.println("Sua nota final aluno 2: ");
        aluno2.setNotaFinal(sc.nextInt());

        System.out.println("Nome aluno 1: ");
        aluno3.setNome(sc.next());
        System.out.println("Matricula aluno 3: ");
        aluno3.setMatricula(sc.nextInt());
        System.out.println("Sua nota final aluno 3: ");
        aluno3.setNotaFinal(sc.nextInt());

        System.out.println("Nome aluno 1: ");
        aluno4.setNome(sc.next());
        System.out.println("Matricula aluno 4: ");
        aluno4.setMatricula(sc.nextInt());
        System.out.println("Sua nota final aluno 4: ");
        aluno4.setNotaFinal(sc.nextInt());

        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
    }
}
