package problemadadospessoas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDadosPessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();
        int contHomem = 0;
        double menorAltura = 10;
        double maiorAltura = 0;
        double sum = 0;
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            input.nextLine();
            System.out.printf("Altura da %da pessoa: ", (i+1));
            double altura = input.nextDouble();
            System.out.printf("Genero da %da pessoa: ", (i+1));
            char genero = input.next().charAt(0);

            pessoas[i] = new Pessoa(altura, genero);

            if (Character.toLowerCase(genero) == 'm') contHomem++;
        }

        // media altura mulheres:
        for (int i = 0; i < pessoas.length; i++) {
            if ((Character.toLowerCase(pessoas[i].getGenero()) == 'f')) {
                sum += pessoas[i].getAltura();
            }
        }
        double mediaAlturaFem = sum / (pessoas.length - contHomem);

        // checagem altura menor/maior:
        for (int i = 0; i < pessoas.length; i++) {
            // maior
            if (maiorAltura < pessoas[i].getAltura()) maiorAltura = pessoas[i].getAltura();
            // menor
            if (menorAltura > pessoas[i].getAltura()) menorAltura = pessoas[i].getAltura();
        }

        System.out.printf("MENOR ALTURA: %.2f\n", menorAltura);
        System.out.printf("MAIOR ALTURA: %.2f\n", maiorAltura);
        System.out.printf("MEDIA DAS ALTURAS DAS MULHERES: %.2f\n", mediaAlturaFem);
        System.out.printf("NUMERO DE HOMENS: %d", contHomem);

        input.close();
    }
}
