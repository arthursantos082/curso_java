package application;

import entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class ExFixacaoBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Banco conta;
        System.out.print("Informe o numero da conta: ");
        int numConta = input.nextInt();
        input.nextLine();

        System.out.print("Informe o nome do dono da conta: ");
        String nomeDono = input.nextLine();

        //Banco conta = new Banco(numConta, nomeDono);

        System.out.print("Havera um deposito inicial (s/n)? ");
        char checagemDeposito = input.nextLine().charAt(0);

        if (Character.toLowerCase(checagemDeposito) == 's') {
            System.out.print("Informe o valor do deposito inicial: ");
            double depositoInicial = input.nextDouble();

            //ao inves de utilizar o set, definir com o metodo constructor
            //segue com o construtor de 3 parametros
            conta = new Banco(numConta, nomeDono, depositoInicial);
        }
        else {
            //segue com o construtor de somente 2, em que nao ha deposito inicial
            // lembrar que a importancia de utilizar construtores eh obrigar objetos a serem instanciados.
            conta = new Banco(numConta, nomeDono);
        }

        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.print("Informe um valor de deposito: ");
        double valorDeposito = input.nextDouble();
        conta.depositarSaldo(valorDeposito);

        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.print("Informe um valor de saque: ");
        double valorSaque = input.nextDouble();
        conta.sacarSaldo(valorSaque);

        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        input.close();

        // exercicio corrigido
        // dar mais importancia aos construtores,
        // nao usar os metodos como muletas
    }
}
