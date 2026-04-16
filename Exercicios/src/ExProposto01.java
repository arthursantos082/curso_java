/*
 Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 mensagem explicativa.
*/

import java.util.Scanner;

public class ExProposto01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma;

        System.out.println("Informe o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.println("Informe o segundo numero: ");
        int num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println("SOMA: " + soma);
    }
}
