/*
 ler um número inteiro N e depois um vetor de N números reais
 mostrar na tela a média arithmetic de todos os elementos com tres casas decimais
 mostrar todos os elementos do vetor que estejam abaixo da média com uma casa decimal
*/

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAbaixoDaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        double[] vetor = new double[n];
        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            input.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();
            soma += vetor[i];
        }

        // media do vetor:
        double media = soma / vetor.length;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);

        // elementos que estao abaixo da media:
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) System.out.printf("%.1f\n", vetor[i]);
        }

        input.close();
    }
}
