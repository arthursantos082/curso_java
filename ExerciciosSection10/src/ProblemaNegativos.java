/*
 ler um numero inteiro positivo N (maximo = 10)
 e depois N numeros inteiros e armazena-los em um vetor
 em seguida, mostrar na tela todos os numeros negativos lidos
*/

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros ira digitar? ");
        int n = input.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            input.nextLine();
            System.out.printf("Digite o numero %d: \n", i+1);
            vect[i] = input.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) System.out.println(vect[i]);
        }

        input.close();
    }
}
