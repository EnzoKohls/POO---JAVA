package AtividedeDeEstudo;

import java.util.Scanner;

public class DadosFuncionario {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        System.out.println("Seu nome: ");
        funcionario.setNome(sc.next());
        System.out.println("Seu salário: ");
        funcionario.setSalario(sc.nextInt());
        System.out.println("Seu cargo: ");
        funcionario.setCargo(sc.next());

        System.out.println(funcionario.toString());
    }
}