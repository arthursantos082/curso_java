/*
 Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
 mostre:
 a) a área do triângulo retângulo que tem A por base e C por altura.
 b) a área do círculo de raio C. (pi = 3.14159)
 c) a área do trapézio que tem A e B por bases e C por altura.
 d) a área do quadrado que tem lado B.
 e) a área do retângulo que tem lados A e B.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExProposto06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        double valorA;
        double valorB;
        double valorC;
        double pi = 3.14159;


        System.out.println("Informe o valor A: ");
        valorA = input.nextDouble();
        System.out.println("Informe o valor B: ");
        valorB = input.nextDouble();
        System.out.println("Informe o valor C: ");
        valorC = input.nextDouble();

        double areaTriangulo = (valorA * valorC) /2 ;
        double areaCirculo = (pi * Math.pow(valorC, 2)) ;
        double areaTrapezio = ((valorA + valorB) * valorC) / 2 ;
        double areaQuadrado = Math.pow(valorB, 2) ; // ou valorB * valorB
        double areaRetangulo = valorA * valorB ;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("TRIANGULO: %.3f\n", areaCirculo);
        System.out.printf("TRIANGULO: %.3f\n", areaTrapezio);
        System.out.printf("TRIANGULO: %.3f\n", areaQuadrado);
        System.out.printf("TRIANGULO: %.3f\n", areaRetangulo);

        input.close();
    }
}

// PRIMEIROS EXS. PROPOSTOS REALIZADOS ! SECTION 4

// LET IT RIP