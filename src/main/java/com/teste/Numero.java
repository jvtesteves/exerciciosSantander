package com.teste;

public class Numero {

    private int valor;

    // Construtor
    public Numero(int valor) {
        this.valor = valor;
    }

    // Método para verificar se o número é par
    public boolean ehPar() {
        return this.valor % 2 == 0;
    }

    // Método para verificar se o número é ímpar
    public boolean ehImpar() {
        return !ehPar();
    }
}
