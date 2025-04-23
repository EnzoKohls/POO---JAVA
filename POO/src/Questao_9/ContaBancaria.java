package Questao_9;

public class ContaBancaria {
    private String numeroDaConta;
    private int saldo;

    public ContaBancaria(String numeroDaConta, int saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {

    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta='" + numeroDaConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
