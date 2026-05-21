package entities;

public class Retangulo {
    public double l;
    public double h;

    public double area(){
        return l * h;
    }

    public double perimetro(){
        return 2 * (l + h);
    }

    public double diagonal(){
        return Math.sqrt((l * l) + (h * h));
    }

    public String toString(){
        return "AREA = " +
                String.format("%.2f", area()) +
                "\n" +
                "PERIMETRO = " +
                String.format("%.2f", perimetro()) +
                "\n" +
                "DIAGONAL = " +
                String.format("%.2f", diagonal()) ;

    }
}
