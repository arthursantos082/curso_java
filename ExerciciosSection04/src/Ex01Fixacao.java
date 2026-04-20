// exercicio de fixacao
// aula 31 do curso de java do prof. nelio alves

import java.util.Locale;

public class Ex01Fixacao {
    public static void main() {

        String produto1 = "Computador";
        String produto2 = "Mesa de Escritório";

        int idade = 18;
        int codigo = 5290;
        char genero = 'M';

        double preco1 = 3499.90;
        double preco2 = 1249.99;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, com preco de R$%.2f\n", produto1, preco1);
        System.out.printf("%s, com preco de R$%.2f\n\n", produto2, preco2);

        System.out.printf("Registro: %d anos, código %d e gênero %c\n\n" , idade, codigo, genero);

        System.out.printf("Medida com oito casas decimais: %.8f\n", medida);
        System.out.printf("Arredondada com tres casas decimais: %.3f\n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f", medida);
    }
}
