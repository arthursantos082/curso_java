package problemasexemplo;

import java.util.Scanner;

public class ProblemaExemploTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double p = (a + b + c) / 2;

        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println(area);

        input.close();
    }
}
