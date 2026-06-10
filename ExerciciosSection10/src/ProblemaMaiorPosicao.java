// ler N numeros reais e armazena-los em um vetor
// mostrar na tela o maior numero do vetor e a posicao do maior elemento

import java.util.Scanner;

public class ProblemaMaiorPosicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros ira digitar? ");
        int n = input.nextInt();
        double[] vetor = new double[n];
        double maiorValor = vetor[0]; // a verificacao comeca do 0 (marco inicial ne esqueceu filho)
        int pos = 0;

        for (int i = 0; i < vetor.length; i++) {
            input.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();

            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                pos = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", pos);

        input.close();
    }
}
