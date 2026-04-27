/*
 Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

import java.util.Scanner;

public class ExProposto01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        int senha = input.nextInt();

        while (senha != 2002){
            System.out.println("Senha invalida");
            System.out.println("Informe a senha: ");
            senha = input.nextInt();
        }

        System.out.println("Acesso permitido");

        input.close();
    }
}
