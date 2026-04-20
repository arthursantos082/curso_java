/*
 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 decimais
*/

import java.util.Locale;
import java.util.Scanner;

public class ExProposto04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.println("Informe o numero do funcionario: ");
        int numFuncionario = input.nextInt();

        System.out.println("Informe a qtd de horas trabalhadas pelo funcionario: ");
        int horaTrabalhada = input.nextInt();

        System.out.println("Informe o valor recebido por hora trabalhada: ");
        float valorHora = input.nextFloat();

        float salario = horaTrabalhada * valorHora;

        System.out.println("NUMERO = " + numFuncionario);
        System.out.printf("SALARIO = R$ %.2f\n", salario);

        input.close();
    }
}
