// comecando a resolver um segundo problema usando orientacao a objetos
// problema exemplo concluido

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
        System.out.print("Name: ");
        product.name = input.nextLine();

        System.out.print("Price: ");
        product.price = input.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = input.nextInt();

        System.out.println();
        System.out.println("Product Data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated Data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated Data: " + product);

        input.close();
    }

}
