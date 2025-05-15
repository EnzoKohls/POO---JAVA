// Arquivo: GuiaPOO.java
// Resumo prático dos principais conceitos de POO em Java
// Comentários detalhados incluídos para explicar o funcionamento interno

// ===============
// 1. CLASSES E OBJETOS
// ===============

class Pessoa {
    // Atributos representam o estado de um objeto
    String nome;
    int idade;

    // Construtor é chamado quando um novo objeto é criado
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método que imprime uma apresentação no console
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

// ===============
// 2. ABSTRAÇÃO
// ===============

// Classe abstrata define estrutura base mas não pode ser instanciada diretamente
abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método abstrato: será implementado nas subclasses
    abstract void emitirSom();
}

// Subclasse que implementa o método abstrato
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println("Au Au"); // Cachorro "fala"
    }
}

// Outra subclasse com implementação própria
class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println("Miau"); // Gato "fala"
    }
}

// ===============
// 3. ENCAPSULAMENTO
// ===============

class ContaBancaria {
    // 'private' impede acesso direto ao atributo
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Getter: retorna o valor do saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter: permite modificar o saldo com regra de negócio
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}

// ===============
// 4. HERANÇA
// ===============

// Classe pai (superclasse)
class Veiculo {
    String marca = "Desconhecida";

    public void buzinar() {
        System.out.println("Bii Bii"); // Método comum a todos os veículos
    }
}

// Classe filha (subclasse) herda da classe Veiculo
class Carro extends Veiculo {
    int portas = 4;

    public void mostrarInfo() {
        // Atributo 'marca' é herdado da classe Veiculo
        System.out.println("Marca: " + marca + ", Portas: " + portas);
    }
}

// ===============
// 5. POLIMORFISMO
// ===============

// Classe base
class Funcionario {
    public void trabalhar() {
        System.out.println("Funcionário está trabalhando.");
    }
}

// Subclasses sobrescrevem o método com comportamentos diferentes
class Gerente extends Funcionario {
    @Override
    public void trabalhar() {
        System.out.println("Gerente está gerenciando a equipe.");
    }
}

class Desenvolvedor extends Funcionario {
    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor está programando.");
    }
}

// ===============
// 6. INTERFACES
// ===============

// Interface define um contrato (métodos obrigatórios)
interface Operavel {
    void ligar();
    void desligar();
}

// Classes implementam a interface
class Computador implements Operavel {
    @Override
    public void ligar() {
        System.out.println("Computador ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado.");
    }
}

class Impressora implements Operavel {
    @Override
    public void ligar() {
        System.out.println("Impressora ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Impressora desligada.");
    }
}

// ===============
// MÉTODO MAIN – Testes
// ===============

class GuiaPOO {
    public static void main(String[] args) {
        // Testando classe Pessoa
        Pessoa p1 = new Pessoa("João", 25);
        p1.apresentar(); // Mostra a apresentação da pessoa

        // Testando abstração com animais
        Animal dog = new Cachorro("Bob");
        Animal cat = new Gato("Mimi");
        dog.emitirSom(); // Deve imprimir "Au Au"
        cat.emitirSom(); // Deve imprimir "Miau"

        // Testando encapsulamento
        ContaBancaria conta = new ContaBancaria(1000);
        conta.depositar(500); // Adiciona 500 ao saldo
        conta.sacar(200);     // Remove 200 do saldo
        System.out.println("Saldo atual: " + conta.getSaldo()); // Mostra saldo

        // Testando herança
        Carro carro = new Carro();
        carro.buzinar();      // Método herdado
        carro.mostrarInfo();  // Exibe marca e portas

        // Testando polimorfismo
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Desenvolvedor();
        f1.trabalhar(); // "Gerente está gerenciando..."
        f2.trabalhar(); // "Desenvolvedor está programando..."

        // Testando interfaces
        Operavel pc = new Computador();
        Operavel printer = new Impressora();
        pc.ligar();       // "Computador ligado."
        printer.ligar();  // "Impressora ligada."
        pc.desligar();    // "Computador desligado."
        printer.desligar(); // "Impressora desligada."
    }
}
