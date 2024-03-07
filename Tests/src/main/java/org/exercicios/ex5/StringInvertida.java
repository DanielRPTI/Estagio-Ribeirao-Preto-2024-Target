package org.exercicios.ex5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        String texto;
        Scanner sc = new Scanner(System.in);
        System.out.println("--\tInversor de String\t--");
        System.out.println("Digite algo para inverter:");
        texto = sc.nextLine();
        System.out.println("--\tTexto invertido\t--");
        System.out.println("{" + revertString(texto) + "}");
    }

    /*Class responsavel por realizar a reversão
      realizamos o tratamento de se caso for informado um valor null ele irá retornar a variavel vazia
      se não ele entra no for e começa a iterar nossa string a partir de seu ultimo indice , a cada interação sendo atribuida
      diretamente em nossa variavel de saída (reverseString) até que nosso laço rompa chegando no indice 0
    */
    public static String revertString(String minhaString) {
        String reverseString = "";
        if (minhaString == null)
            return minhaString;
        for (int i = minhaString.length() - 1; i >= 0; i--) reverseString = reverseString + minhaString.charAt(i);
        return reverseString;
    }
}
