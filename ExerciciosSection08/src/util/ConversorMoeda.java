package util;

public class ConversorMoeda {
    public static double valorEmReais(double precoDolar, double qtdDolar){
        return (precoDolar * qtdDolar) + (precoDolar * qtdDolar * 0.06) ;
    }
}
