/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/

package partedois;

import java.util.Locale;
import java.util.Scanner;

public class ExProposto03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();

        for (int i = 0; i < (n); i++) {
            double x1 = input.nextDouble();
            double x2 = input.nextDouble();
            double x3 = input.nextDouble();
            double mediaPond = (x1*2.0 + x2*3.0 + x3*5.0) / 10;
            System.out.printf("%.1f\n", mediaPond);
        }


        input.close();
    }
}
