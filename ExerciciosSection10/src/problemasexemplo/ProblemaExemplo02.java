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

        // qtd de produtos:
        int n = input.nextInt();
        // criacao do objeto produto com seus atributos
        Produto[] produto = new Produto[n];

        for (int i = 0; i < produto.length; i++) {
            input.nextLine(); // \n devido ao nextInt
            String nome = input.nextLine();
            double preco = input.nextDouble();
            // como o objeto foi criado como vetor, passamos os parametros para ele
            // por i vezes, visto que nome e produto sao desatribuidos assim q saem do escopo
            produto[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < produto.length; i++) {
            soma += produto[i].getPreco(); // os getters sao funcoes que retornam um valor, assim, pegamos o preco de cada item
        }
        double media = soma / produto.length;

        System.out.printf("PRECO MEDIO: %.2f", media);

        input.close();
    }
}
