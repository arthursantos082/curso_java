// ler N numeros reais e armazena-los em um vetor
// em seguida imprimir todos os elementos do vetor
// mostrar na tela a soma e a media dos elementos do vetor

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros ira digitar? ");
        int nums = input.nextInt();
        double[] vetor = new double[nums];
        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            input.nextLine();
            System.out.printf("Digite o numero %d: ", i+1);
            vetor[i] = input.nextDouble();
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        System.out.print("VALORES: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f", media);

        input.close();
    }
}
