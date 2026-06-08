/*
 ler um número inteiro N e os dados (nome e preço) de N produtos
 armazenar os N produtos em um vetor, em seguida, mostrar o preço medio dos produtos
*/

package problemasexemplo;

import java.util.Locale;
import java.util.Scanner;

// semana de provas, vou descansar por agora... nao consigo compreender AINDA
public class ProblemaExemplo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int n = input.nextInt();


        input.close();
    }
}
