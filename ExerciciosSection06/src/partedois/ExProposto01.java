/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
*/

package partedois;

import java.util.Scanner;

public class ExProposto01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for (int i = 1; i<=x; i++){
            if (i % 2 != 0) System.out.println(i);
        }

        input.close();
    }
}
