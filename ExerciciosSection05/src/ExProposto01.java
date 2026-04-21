// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class ExProposto01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Informe um numero inteiro: ");
        num = input.nextInt();

        if (num > 0) {
            System.out.printf("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");

        }
        input.close();
    }
}
