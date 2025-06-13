package Atv_2_Prova;

//Criando a classe abstrata, implementando seus atributos e encapssulando
abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //Inserindo vilidação de erro
        if (nome == null) {
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        //Inserindo vilidação de erro
        if (cpf == null) {
            throw new IllegalArgumentException("CPF possui valor inferior a 11 dígitos");
        }
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        //Inserindo vilidação de erro
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário não pode ser nulo");
        }
        this.salario = salario;
    }

    //Adicionando métodos Abstratos e não Abstratos
    public abstract void exibirCargo();
    public abstract void calcularBonus();

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: " + salario);
    }
}
