package problemasexemplo;

import java.util.Scanner;

public class ExemploTrianguloOO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        String largerArea = (x.area() > y.area()) ? "Larger area: X" : "Larger area: Y";

        System.out.printf("Area do triangulo x: %.4f\n", x.area());
        System.out.printf("Area do triangulo y: %.4f\n", y.area());
        System.out.println(largerArea);

        input.close();
    }
}
