/*
 ler um conjunto de N nomes de alunos, e as notas que eles tiraram nos 1 e 2 semestres
 imprimir os nomes dos alunos aprovados, considerando media >= a 6.0
*/

package problemaaprovados;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAprovados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos alunos serao digitados? ");
        int n = input.nextInt();
        Alunos[] alunos = new Alunos[n];

        for (int i = 0; i < alunos.length; i++) {
            input.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", (i+1) );
            String nome = input.nextLine();
            double nota1 = input.nextDouble();
            double nota2 = input.nextDouble();

            alunos[i] = new Alunos(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < alunos.length; i++) {
            if ((alunos[i].getNota1() + alunos[i].getNota2()) / 2 >= 6.0){
                System.out.println(alunos[i].getNome());
            }
        }

        input.close();
    }
}
