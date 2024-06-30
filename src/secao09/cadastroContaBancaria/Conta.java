package secao09.cadastroContaBancaria;

public class Conta {
    private final int numero;
    private String titular;
    private double saldo;
    static final double IMPOSTO = 5;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        depositar(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= (valor + IMPOSTO);
    }

    @Override
    public String toString() {
        return "Número: " + getNumero() + "\nTitular: " + getTitular() + "\nSaldo: " + getSaldo();
    }
}
