// ler N numeros inteiros e armazena-los em um vetor
// mostrar na tela todos os numeros pares e a qtd de numeros pares

import java.util.Scanner;

public class ProblemaNumerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros ira digitar? ");
        int n = input.nextInt();
        int[] vetorPares = new int[n];
        int qtdPares = 0;

        for (int i = 0; i < vetorPares.length; i++) {
            input.nextLine();
            System.out.print("Digite um numero: ");
            vetorPares[i] = input.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");
        for (int i = 0; i < vetorPares.length; i++) {
            if (vetorPares[i] % 2 == 0){
                //qtdPares += 1;
                qtdPares++;
                System.out.printf("%d   " , vetorPares[i]);
            }
        }

        System.out.print("\nQUANTIDADE DE PARES = " + qtdPares);

        input.close();
    }
}
