/*
 ler o nome de um aluno e as tres notas que ele obteve nos tres trimestres do ano
 ao final mostrar qual a nota final do aluno
 dizer se ele passou ou reprovou
 em caso negativo, mostrar quantos pontos faltam para o aluno obter o minimo para ser aprovado (60% da nota)
 primeiro trimestre vale 30, segundo e terceiro valem 35
 30 + 35 + 35 = 100 => entao o minimo eh 60 pontos...
*/

package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ExProposto03Aluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();
        aluno.nomeAluno = input.nextLine();
        aluno.notaUm = input.nextDouble();
        aluno.notaDois = input.nextDouble();
        aluno.notaTres = input.nextDouble();

        System.out.println("NOTA FINAL = " + aluno.notaFinal());

        if (aluno.notaFinal() < 60) {
            System.out.println("REPROVADO");
            System.out.printf("FALTAM %.2f PONTOS\n", aluno.pontosFaltando());
        }
        else System.out.println("APROVADO");

        input.close();
    }
}
