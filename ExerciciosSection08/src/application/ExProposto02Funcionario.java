/*
 ler os dados de um funcionario (nome, salario bruto e imposto)
 mostrar os dados do funcionario (nome e salario liquido)
 aumentar o salario do funcionario com base em uma porcentagem (somente o salario bruto e afetado)
 mostrar novamente os dados do funcionario
*/

package application;

import entities.Funcionario;

import java.util.Scanner;

public class ExProposto02Funcionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = input.nextLine();

        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = input.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = input.nextDouble();

        System.out.println("Funcionario: " + funcionario);

        System.out.print("Qual a porcentagem de aumento do salario? ");
        double porcentagem = input.nextDouble();
        funcionario.aumento(porcentagem);

        System.out.println("Dados atualizados: " + funcionario);

        input.close();
    }
}
