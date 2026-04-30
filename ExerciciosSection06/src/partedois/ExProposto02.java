/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

package partedois;

import java.util.Scanner;

public class ExProposto02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 1; i <= N; i++){
            int X = input.nextInt();

            if ((X >= 10 && X <= 20)){
                in += 1;
            }
            else out += 1;
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out", out);

        input.close();
    }
}
