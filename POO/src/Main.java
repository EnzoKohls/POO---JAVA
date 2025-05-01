// Salve como Main.java

package ATIVIDADES_POO.Questao_Heranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite a matrícula do aluno: ");
        String matricula = sc.nextLine();

        // Cria o aluno com os dados informados
        Aluno aluno1 = new Aluno(nome, idade, matricula);

        System.out.println("\n--- Dados do Aluno ---");
        aluno1.exibirDados();

        sc.close();

    }
}

// Superclasse
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// Subclasse
class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }
}
