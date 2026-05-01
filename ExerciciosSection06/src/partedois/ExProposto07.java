/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
*/

package partedois;

import java.util.Scanner;

public class ExProposto07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d\n", i, i*i, i*i*i);
        }

        input.close();
    }
}


// esse aqui eu simplifiquei demais kkkkkkkkk rachei a cuca
// SECTION 06 COMPLETA
// LET IT RIP