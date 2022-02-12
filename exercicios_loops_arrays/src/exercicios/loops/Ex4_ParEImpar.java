package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNUmeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numeros");
        quantNUmeros = scan.nextInt();


        int i = 0;
        do {
            System.out.println("Numero:");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            i++;
        }while(i < quantNUmeros);

        System.out.println("Quantidade de numeros pares:" + quantPares);
        System.out.println("Quantidade de numeros impares:" + quantImpares);


        }
}
