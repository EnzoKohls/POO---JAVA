package Atv_1_Prova;

abstract class Transporte {
    //Criando a classe abstrata, implementando seus atributos e encapssulando
    private String nome;
    private int velocidadeMaxima;
    private int autonomia;
    private String tipoDeCombustivel;

    public Transporte(String nome, int velocidadeMaxima, int autonomia, String tipoDeCombustivel) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.autonomia = autonomia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //Inserindo vilidação de erro
        if (nome == null){
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        //Inserindo vilidação de erro
        if (velocidadeMaxima <= 5) {
            throw new IllegalArgumentException("Velocidade deve ser maior que 5 km/h");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        //Inserindo vilidação de erro
        if (autonomia <= 0) {
            throw new IllegalArgumentException("Autonomia deve ser maior que 0 km");
        }
        this.autonomia = autonomia;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        //Inserindo vilidação de erro
        if (tipoDeCombustivel == null) {
            throw new IllegalArgumentException("Valor Vazio");
        }
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    //Adicionando métodos Abstratos e não Abstratos
    public abstract void mover();

    public abstract void parar();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Autonomia: " + autonomia + " km");
        System.out.println("Tipo de Combustível: " + tipoDeCombustivel);

    }
}