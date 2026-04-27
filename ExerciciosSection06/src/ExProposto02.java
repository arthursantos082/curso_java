/*
 Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/

import java.util.Locale;
import java.util.Scanner;

public class ExProposto02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe as coordenadas x e y: ");
        int x = input.nextInt();
        int y = input.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("PRIMEIRO");
            }
            else if (x < 0 && y > 0) {
                System.out.println("SEGUNDO");
            }
            else if (x < 0) {
                System.out.println("TERCEIRO");
            }
            else System.out.println("QUARTO");

            System.out.println("Informe as coordenadas x e y: ");
            x = input.nextInt();
            y = input.nextInt();
        }

        input.close();
    }
}
