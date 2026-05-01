/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

package partedois;

import java.util.Scanner;

public class ExProposto04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = input.nextInt();
            int x2 = input.nextInt();
            double div = (double) x1 / x2;
            if (x2 == 0){
                System.out.println("Divisao impossivel");
            }
            else System.out.println(div);
        }

        input.close();
    }
}
