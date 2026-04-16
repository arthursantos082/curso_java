/*
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExProposto05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.println("Informe o codigo da peca 1: ");
        int cod1 = input.nextInt();

        System.out.println("Informe o numero de pecas 1: ");
        int qtdPecas1 = input.nextInt();

        System.out.println("Informe o valor de cada peca 1: ");
        float valorPecas1 = input.nextFloat();

        System.out.println("Informe o codigo da peca 2: ");
        int cod2 = input.nextInt();

        System.out.println("Informe o numero de pecas 2: ");
        int qtdPecas2 = input.nextInt();

        System.out.println("Informe o valor de cada peca 2: ");
        float valorPecas2 = input.nextFloat();

        float valorTotal = (qtdPecas1 * valorPecas1) + (qtdPecas2 * valorPecas2);

        System.out.printf("VALOR A PAGAR: %.2f\n", valorTotal);
    }
}
