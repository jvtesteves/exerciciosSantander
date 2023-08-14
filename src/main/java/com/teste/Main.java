package com.teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Teste para a classe pessoa

        Pessoa pessoa = new Pessoa("João", 30, 1.75, 70);
        System.out.println(pessoa);

        //  Teste para a classe calculadora

        Calculadora calc = new Calculadora(6, 3);
        calc.setValor1(18);
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());

        //  Teste para a classe numero

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroEntrada = scanner.nextInt();

        Numero numero = new Numero(numeroEntrada);

        if (numero.ehPar()) {
            System.out.println("O número " + numeroEntrada + " é par.");
        } else if (numero.ehImpar()) {
            System.out.println("O número " + numeroEntrada + " é ímpar.");
        }

        scanner.close();

        //  Teste para a classe objeto

        Objeto carro = new Objeto(2000, 200); // Força em Newton e massa em kg

        double aceleracao = carro.calcularAceleracao();

        System.out.println("A aceleração do carro é: " + aceleracao + " m/s²");

    }
}