package com.teste;

public class Calculadora {

    // Atributos
    private double valor1;
    private double valor2;

    // Construtor
    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Métodos de operações
    public double somar() {
        return this.valor1 + this.valor2;
    }

    public double subtrair() {
        return this.valor1 - this.valor2;
    }

    public double multiplicar() {
        return this.valor1 * this.valor2;
    }

    public double dividir() {
        if (this.valor2 != 0) {
            return this.valor1 / this.valor2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna "Not a Number" para representar o erro de divisão por zero.
        }
    }

    // Métodos getter e setter para valor1
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    // Métodos getter e setter para valor2
    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
}
