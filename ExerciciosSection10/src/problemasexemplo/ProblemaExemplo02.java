/*
 ler um número inteiro N e os dados (nome e preço) de N produtos
 armazenar os N produtos em um vetor, em seguida, mostrar o preço medio dos produtos
*/

package problemasexemplo;

import java.util.Locale;
import java.util.Scanner;

// descansar? se conforma voce.
public class ProblemaExemplo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();
        Produto[] produto = new Produto[n];

        for (int i = 0; i < produto.length; i++) {
            input.nextLine();
            String nome = input.nextLine();
            double preco = input.nextDouble();
            // instanciar o objeto
            produto[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < produto.length; i++) {
            soma += produto[i].getPreco();
        }
        double media = soma / produto.length;

        System.out.printf("PRECO MEDIO: %.2f", media);

        input.close();
    }
}
