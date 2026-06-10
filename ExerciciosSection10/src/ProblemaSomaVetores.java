/*
 ler dois vetores A e B com N elementos cada
 gerar um terceiro vetor C, onde cada elemento de C eh a soma dos elementos de A e B
 imprimir o vetor C gerado
*/

import java.util.Scanner;

public class ProblemaSomaVetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor: ");
        int n = input.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        // vetor A:
        for (int i = 0; i < vetorA.length; i++) {
            input.nextLine();
            System.out.print("Digite os valores de A: ");
            vetorA[i] = input.nextInt();
        }
        // vetor B:
        for (int i = 0; i < vetorB.length; i++) {
            input.nextLine();
            System.out.print("Digite os valores de B: ");
            vetorB[i] = input.nextInt();
        }

        // composição, vetor C:
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] += vetorA[i] + vetorB[i];
        }

        // vetor resultante C:
        System.out.println("\nVETOR RESULTANTE: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }


        input.close();
    }
}
