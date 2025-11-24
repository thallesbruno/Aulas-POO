package edu.pucgoias.classes_abstratas;

public abstract class Conta {
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void imprimeExtrato();

    final float retornaTaxaDeJuros(int mesAtual) {
        return (mesAtual == 12) ? 0.5f: 0.8f;
    }
}
