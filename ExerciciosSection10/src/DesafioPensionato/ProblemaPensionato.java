/*
    Fazer um programa que inicie com todos os dez quartos vazios(0-9),
    ler uma qtd N representando o numero de estudantes que vao alugar quartos (pode ser 1-10)
    registrar o aluguel dos N estudantes.
    para cada aluguel, informar nome e email do estudante, bem como os quartos que escolheu.
    no final do programa, imprimir um relatorio de todas ocupações do pensionato por ordem de quarto
 */

package DesafioPensionato;

import java.util.Scanner;

public class ProblemaPensionato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos quartos serao alugados? ");
        int qtdQuartos = input.nextInt();
        Pensionato[] quartoOcupado = new Pensionato[10];

        for (int i = 0; i < qtdQuartos; i++) {
            input.nextLine();
            System.out.printf("Aluguel #%d:\n", (i+1));
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Quarto: ");
            int numQuarto = input.nextInt();

            quartoOcupado[numQuarto] = new Pensionato(nome, email);
        }

        // relatorio de ocupacao
        System.out.println("\nQuartos ocupados:");

        // printar em ordem:
        for (int i = 0; i < 10; i++) {
            if (quartoOcupado[i] != null){
                System.out.printf("%d: %s\n", i, quartoOcupado[i]);
            }
        }

        input.close();

        // exercicio complicado!!
        // revisar logica.
    }
}
