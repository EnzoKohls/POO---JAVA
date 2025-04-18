package Questao_7;

import AtividedeDeEstudo.Funcionario;

import java.util.Scanner;

public class DadosAnimal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println("Seu nome: ");
        animal.setNome(sc.next());
        System.out.println("Sua raça: ");
        animal.setRaca(sc.next());
        System.out.println("Sua idade: ");
        animal.setIdade(sc.nextInt());

        System.out.println(animal.toString());
    }
}
