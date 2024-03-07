package org.exercicios.ex1;

/*
1) Observe o trecho de código abaixo:
    Modelo do Codigo na Gupy
Ao final do processamento, qual será o valor da variável SOMA? Soma = 91
*/
public class Soma {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;
        while(k < indice){
            k = k + 1;
            soma += k;
        }
        System.out.println(soma);//Valor da varivel soma é igual a 91
    }
}