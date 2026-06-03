/*
 fazer um programa para ler um número inteiro N e a altura de N pessoas
 armazenar as N alturas em um vetor, em seguida, mostrar a altura media
*/

package problemasexemplo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = input.nextDouble();
        }

        // armazenar os valores dentro do vetor para depois realizar a operação media
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        // media = elementos / qtd. elementos
        double media = soma / n;

        System.out.printf("ALTURA MEDIA: %.2f\n", media);

        input.close();
    }
}
