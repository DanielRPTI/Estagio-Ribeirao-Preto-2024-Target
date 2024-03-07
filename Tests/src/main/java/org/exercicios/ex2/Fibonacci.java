package org.exercicios.ex2;

/*
    Cálculo Fibonacci logica:
    Formula Fibo()
 */
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiroValor ;
        int segundoValor;
        int valorAuxiliar = 0;
        int soma = 0;

        System.out.println("--\tCalculo Fibonacci\t--");
        System.out.println("Por favor informe um número para realizar o cálculo: ");
        primeiroValor = sc.nextInt();
        System.out.println("Por favor informe outro número para realizar o cálculo: ");
        segundoValor = sc.nextInt();

        //laço para realizarmos nosso calculo e ir atribuindo as variaveis sequencialmente, até estourar o laço
        for (int i = 0; i < 10; i++){
            System.out.print("{" + valorAuxiliar + "}");
            valorAuxiliar = primeiroValor + segundoValor;
            primeiroValor = segundoValor;
            segundoValor = valorAuxiliar;

        }
    }
}
