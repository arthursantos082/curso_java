/*
 ler um conjunto de nomes de pessoas e suas respectivas idades
 os nomes devem ser armazenados em um vetor, e as idades em outro vetor
 mostrar na tela o nome da pessoa mais velha
*/

package problemamaisvelho;

import java.util.Scanner;

public class ProblemaMaisVelho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = input.nextInt();
        int idadeMaisVelho = 0;
        String nomeMaisVelho = "";
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            input.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i+1);

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();

            pessoas[i] = new Pessoa(nome, idade);
        }

        for (int i = 0; i < pessoas.length; i++) {
            if (idadeMaisVelho < pessoas[i].getIdade()){
                idadeMaisVelho = pessoas[i].getIdade();
                nomeMaisVelho = pessoas[i].getNome();
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", nomeMaisVelho);

        input.close();
    }
}
