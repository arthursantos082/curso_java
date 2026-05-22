/*
 ler a cotacao do dolar, e depois o valor em dolares a ser comprado em reais
 informar quantos reais a pessoa vai pagar pelos dolares, considerando 6% de IOF sobre o valor em dolar
*/

package application;

import util.ConversorMoeda;

import java.util.Locale;
import java.util.Scanner;

public class ExFixacaoConversor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Qual o preco do dolar? ");
        double precoDolar = input.nextDouble();

        System.out.print("Quantos dolares serao comprados? ");
        double qtdDolar = input.nextDouble();

        System.out.printf("Valor a ser pago em reais = %.2f" , ConversorMoeda.valorEmReais(precoDolar, qtdDolar));

        input.close();
    }
}
