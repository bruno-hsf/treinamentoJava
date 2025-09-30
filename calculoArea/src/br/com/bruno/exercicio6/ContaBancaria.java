package br.com.bruno.exercicio6;

public class ContaBancaria {
    private String contaCorrente;
    private double saldo;

    public ContaBancaria(String contaCorrente, double saldo) {
        this.contaCorrente = contaCorrente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta " + contaCorrente + " com saldo de R$" + saldo;
    }
}
