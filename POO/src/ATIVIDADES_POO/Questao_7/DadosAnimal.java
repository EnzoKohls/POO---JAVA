package ATIVIDADES_POO.Questao_7;

import java.util.Scanner;

public class DadosAnimal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        System.out.println("Nome do 1 animal: ");
        animal1.setNome(sc.next());
        System.out.println("Raça do 1 animal: ");
        animal1.setRaca(sc.next());
        System.out.println("Idade do 1 animal: ");
        animal1.setIdade(sc.nextInt());

        System.out.println("Nome do 1 animal: ");
        animal2.setNome(sc.next());
        System.out.println("Raça do 1 animal: ");
        animal2.setRaca(sc.next());
        System.out.println("Idade do 1 animal: ");
        animal2.setIdade(sc.nextInt());

        System.out.println("Nome do 1 animal: ");
        animal3.setNome(sc.next());
        System.out.println("Raça do 1 animal: ");
        animal3.setRaca(sc.next());
        System.out.println("Idade do 1 animal: ");
        animal3.setIdade(sc.nextInt());

        System.out.println("Nome do 1 animal: ");
        animal4.setNome(sc.next());
        System.out.println("Raça do 1 animal: ");
        animal4.setRaca(sc.next());
        System.out.println("Idade do 1 animal: ");
        animal4.setIdade(sc.nextInt());

        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());
        System.out.println(animal4.toString());
    }
}
