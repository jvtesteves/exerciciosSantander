package com.teste;

public class Objeto {

    private double forca;
    private double massa;

    // Construtor
    public Objeto(double forca, double massa) {
        this.forca = forca;
        this.massa = massa;
    }

    // Método para calcular a aceleração
    public double calcularAceleracao() {
        return this.forca / this.massa;
    }

    // Métodos getters (opcional para este exemplo, mas útil se precisar)
    public double getForca() {
        return forca;
    }

    public double getMassa() {
        return massa;
    }
}
