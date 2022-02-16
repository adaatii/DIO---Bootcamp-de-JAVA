package exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {2, -3, 50, 15, 8, 6};
        int i =0;
        int j;

        System.out.println("Vetor:");
        while(i < vetor.length){
            System.out.print(vetor[i] +" ");
            i++;
        }
        System.out.println("\nVetor:");
        for ( j = (vetor.length - 1); j >= 0 ; j--) {
            System.out.print(vetor[j] +" ");
        }


    }
}
