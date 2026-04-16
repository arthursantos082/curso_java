/*
 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 decimais
*/

import java.util.Scanner;

public class ExProposto03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diferenca;

        System.out.println("Informe o primeiro numero: ");
        int num1 = input.nextInt();
        System.out.println("Informe o segundo numero: ");
        int num2 = input.nextInt();
        System.out.println("Informe o terceiro numero: ");
        int num3 = input.nextInt();
        System.out.println("Informe o quarto numero: ");
        int num4 = input.nextInt();

        diferenca = (num1 * num2) - (num3 * num4);

        System.out.println("DIFERENÇA = " + diferenca);
    }
}
