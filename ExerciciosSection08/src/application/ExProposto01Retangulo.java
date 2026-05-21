/*
 ler os valores da largura e altura de um retangulo
 mostrar na tela o valor de sua area, perimetro e diagonal
 usar uma classe
*/

package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class ExProposto01Retangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Retangulo retangulo =  new Retangulo();

        System.out.println("Informe a largura e a altura do retangulo: ");

        retangulo.l = input.nextDouble();
        retangulo.h = input.nextDouble();

        System.out.println(retangulo);

        input.close();
    }
}
