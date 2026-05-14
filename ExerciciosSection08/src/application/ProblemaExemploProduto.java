// comecando a resolver um segundo problema usando orientacao a objetos

package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Produto product = new Produto();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = input.nextLine();

        System.out.println("Price: ");
        product.price = input.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = input.nextInt();

        System.out.println(product.name + " " + product.price + " " + product.quantity);

        input.close();
    }

}
