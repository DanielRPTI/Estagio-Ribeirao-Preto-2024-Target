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

    public static String revertString(String minhaString) {
        if (minhaString == null)
            return minhaString;
        String reverseString = "";
        for (int i = minhaString.length() - 1; i >= 0; i--) reverseString = reverseString + minhaString.charAt(i);
        return reverseString;
    }
}
