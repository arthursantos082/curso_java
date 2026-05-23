package application;

import entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class ExFixacaoBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        double deposito, saque;
        System.out.print("Informe o numero da conta: ");
        int numConta = input.nextInt();
        input.nextLine();

        System.out.print("Informe o nome do dono da conta: ");
        String nomeDono = input.nextLine();

        Banco conta = new Banco(numConta, nomeDono);

        System.out.print("Havera um deposito inicial (s/n)? ");
        char checagemDeposito = input.nextLine().charAt(0);

        if (Character.toLowerCase(checagemDeposito) == 's') {
            System.out.print("Informe o valor do deposito inicial: ");
            deposito = input.nextDouble();
            //conta.setSaldo(deposito); -> ao inves de utilizar o set, definir com o metodo
            conta.depositarSaldo(deposito); // forma correta

        }
        else {
            //conta.setSaldo(deposito); segue a mesma linha do if
            conta.depositarSaldo(0);
        }

        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.print("Informe um valor de deposito: ");
        deposito = input.nextDouble();
        conta.depositarSaldo(deposito);

        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.print("Informe um valor de saque: ");
        saque = input.nextDouble();
        conta.sacarSaldo(saque);

        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        input.close();
    }
}
