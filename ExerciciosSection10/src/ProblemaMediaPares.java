// ler um vetor de N numeros inteiros
// mostrar na tela a media aritmetica somente dos pares lidos com uma casa decimal
// se nenhum numero par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos terá o vetor: ");
        int n = input.nextInt();
        int qtdPares = 0;
        int[] vetor = new int[n];
        int soma = 0;
        double media = 0.0;
        boolean hasPar = false;

        for (int i = 0; i < vetor.length; i++) {
            input.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextInt();
        }

        // verificação dos pares:
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                qtdPares++;
                hasPar = true;
            }
        }

        // se nao houver pares
        if (!hasPar) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = (double) soma / qtdPares;
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }

        // nao era necessario o boolean...

        input.close();
    }
}
