/*
 escreva um programa que leia o código de um item e a quantidade deste item.
 A seguir, calcule e mostre o valor da conta a pagar.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExProposto05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double precoTotal = 0;
        
        System.out.println("CODIGO  ESPECIFICACAO   PRECO");
        System.out.println("1   CACHORRO QUENTE R$ 4.00");
        System.out.println("2   X-SALADA   R$ 4.50");
        System.out.println("3   X-BACON R$ 5.00");
        System.out.println("4   TORRADA SIMPLES R$ 2.00");
        System.out.println("5   REFRIGERANTE    R$ 1.50");
        
        System.out.println("INFORME O CODIGO DO ITEM: ");
        int codigoItem = input.nextInt();

        System.out.println("INFORME A QTD DO ITEM: ");
        int qtdItem = input.nextInt();
        
        if (codigoItem == 1) {
            precoTotal = qtdItem * 4;
        } 
        else if (codigoItem == 2) {
            precoTotal = qtdItem * 4.5;
        } 
        else if (codigoItem == 3) {
            precoTotal = qtdItem * 5;
        } 
        else if (codigoItem == 4) {
            precoTotal = qtdItem * 2;    
        } 
        else if (codigoItem == 5) {
            precoTotal = qtdItem * 1.5;
        }
        else {
            System.out.println("INFORME UM CODIGO VALIDO");
        }

        System.out.printf("Total: R$ %.2f\n",precoTotal);
        
        input.close();
    }
}
