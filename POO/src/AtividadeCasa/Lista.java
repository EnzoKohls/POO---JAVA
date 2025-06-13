
package AtividadeCasa;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Cachorro("Bibi", 5, "Viralata"));

        for (Animal animal : animals) {
            animal.emitirSom();
            animal.comer();
            animal.exibirInformacoes();
            System.out.println("-----");
        }
    }
}

/*
public abstract class Transporte {
    private String nome;
    private int velocidadeMaxima;
    private int autonomia;
    private String tipoDeCombustivel;

    public Transporte(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        this.setNome(nome);
        this.setVelocidadeMaxima(velocidadeMaxima);
        this.setAutonomia(autonomia);
        this.setTipoDeCombustivel(tipoDeCombustivel);
    }

    // Getters e Setters com validações
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima <= 5) {
            throw new IllegalArgumentException("Velocidade máxima deve ser maior que 5 km/h.");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        if (autonomia <= 0) {
            throw new IllegalArgumentException("Autonomia deve ser maior que 0 km.");
        }
        this.autonomia = autonomia;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        if (tipoDeCombustivel == null || tipoDeCombustivel.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de combustível não pode ser vazio.");
        }
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    // Método abstrato
    public abstract void mover();
    public abstract void parar();

    // Método não abstrato
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Autonomia: " + autonomia + " km");
        System.out.println("Tipo de Combustível: " + tipoDeCombustivel);
    }
}

public class Carro extends Transporte {
    public Carro(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        super(nome, velocidadeMaxima, autonomia, tipoDeCombustivel);
    }

    public void mover() {
        System.out.println("O carro está se movendo.");
    }

    public void parar() {
        System.out.println("O carro parou.");
    }
}
------------------

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Transporte> transportes = new ArrayList<>();

        System.out.println("Cadastro de Carro:");
        transportes.add(cadastrarTransporte(scanner, "Carro"));

        System.out.println("\nCadastro de Moto:");
        transportes.add(cadastrarTransporte(scanner, "Moto"));

        System.out.println("\nCadastro de Ônibus:");
        transportes.add(cadastrarTransporte(scanner, "Onibus"));

        System.out.println("\nCadastro de Bicicleta:");
        transportes.add(cadastrarTransporte(scanner, "Bicicleta"));

        System.out.println("\n--- Executando métodos para cada transporte ---\n");
        for (Transporte t : transportes) {
            t.mover();
            t.parar();
            t.exibirInformacoes();
            System.out.println("-----------------------------");
        }

        scanner.close();
    }

    public static Transporte cadastrarTransporte(Scanner scanner, String tipo) {
        String nome, combustivel;
        int velocidade, autonomia;

        while (true) {
            try {
                System.out.print("Nome: ");
                nome = scanner.nextLine();

                System.out.print("Velocidade Máxima (km/h): ");
                velocidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Autonomia (km): ");
                autonomia = Integer.parseInt(scanner.nextLine());

                System.out.print("Tipo de Combustível: ");
                combustivel = scanner.nextLine();

                switch (tipo) {
                    case "Carro":
                        return new Carro(nome, velocidade, autonomia, combustivel);
                    case "Moto":
                        return new Moto(nome, velocidade, autonomia, combustivel);
                    case "Onibus":
                        return new Onibus(nome, velocidade, autonomia, combustivel);
                    case "Bicicleta":
                        return new Bicicleta(nome, velocidade, autonomia, combustivel);
                    default:
                        throw new IllegalArgumentException("Tipo inválido.");
                }

            } catch (IllegalArgumentException | NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente.\n");
            }
        }
    }
}

 */