// ler nome, idade e altura de N pessoas
// mostrar na tela a altura media das pessoas, e a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver

package problemaalturas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serao informadas? ");
        int numPessoas = input.nextInt();
        double soma = 0.0;
        Pessoa[] pessoas = new Pessoa[numPessoas];

        for (int i = 0; i < pessoas.length; i++) {
            input.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            input.nextLine();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
            soma += pessoas[i].getAltura();
        }

        // calculo altura media
        double alturaMedia = soma / pessoas.length;

        // armazenar qtd de pessoas menores de 16
        int menorDe16 = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > 16) menorDe16 += 1;
        }
        double pctgMenor16 = (double) menorDe16 / pessoas.length * 100.0; // garantir 1 casa decimal

        System.out.printf("\nAltura media: %.2f\n", alturaMedia);
        System.out.println("Pessoas com menos de 16 anos: " + pctgMenor16 + "%");

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) System.out.println(pessoas[i].getNome());
        }

        input.close();
    }
}
