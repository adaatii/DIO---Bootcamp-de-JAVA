package exercicios.arrays;

import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int i = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
                consoantes[i] = letra;
                quantConsoantes++;
            }

            i++;

        }while(i < consoantes.length);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes ) {

            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        System.out.println("\nQuantidade de consoantes:" + quantConsoantes);

    }
}
