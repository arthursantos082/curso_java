package util;

public class ConversorMoeda {
    // o exercicio foi concluido de primeira sem utilizar a constante IOF
    // segue com o IOF static

    public static double IOF = 0.06;

    public static double valorEmReais(double precoDolar, double qtdDolar){
        // primeira versao:
        //return (precoDolar * qtdDolar) + (precoDolar * qtdDolar * 0.06) ;

        // segunda versao:
        return (precoDolar * qtdDolar) * (IOF + 1.0);
    }
}
