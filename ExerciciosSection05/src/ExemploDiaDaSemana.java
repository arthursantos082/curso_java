// uso switch-case
// programa para mostrar os dias da semana conforme o numero inserido

import java.util.Locale;
import java.util.Scanner;

public class ExemploDiaDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nomeDia;

        System.out.println("Informe o numero do numero do dia da semana: (1-7)");
        int numeroDia = input.nextInt();


        switch (numeroDia){
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda";
                break;
            case 3:
                nomeDia = "terca";
                break;
            case 4:
                nomeDia = "quarta";
                break;
            case 5:
                nomeDia = "quinta";
                break;
            case 6:
                nomeDia = "sexta";
                break;
            case 7:
                nomeDia = "sabado";
                break;
            default:
                nomeDia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + nomeDia);

        input.close();
    }
}
