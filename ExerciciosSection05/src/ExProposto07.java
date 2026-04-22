/*
 Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
 de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
 ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
*/

import java.util.Locale;
import java.util.Scanner;

public class ExProposto07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("INFORME A COORDENADA X: ");
        double x = input.nextDouble();

        System.out.println("INFORME A COORDENADA Y: ");
        double y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("ORIGEM");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (x > 0 && y > 0) {
            System.out.println("QUADRANTE 1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("QUADRANTE 2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("QUADRANTE 3");
        }
        else if (x > 0 && y < 0){
            System.out.println("QUADRANTE 4");
        }

        input.close();
    }
}
