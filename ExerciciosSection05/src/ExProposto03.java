/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */

import java.util.Scanner;

public class ExProposto03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor A: ");
        int valA = input.nextInt();

        System.out.println("Informe o valor B: ");
        int valB = input.nextInt();

        if (valA % valB == 0 || valB % valA == 0) {
            System.out.println("MULTIPLOS");
        }
        else {
            System.out.println("NAO MULTIPLOS");
        }

        input.close();
    }
}
