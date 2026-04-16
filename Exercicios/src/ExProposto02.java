/*
 Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 casas decimais.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExProposto02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float pi = 3.14159f;

        System.out.println("Informe o valor do raio do circulo: ");
        float raio = input.nextFloat();

        float area = (float) (pi * Math.pow(raio, 2));

        System.out.printf("A=%.4f", area);
    }
}
