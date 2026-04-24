/*
 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Scanner;

public class ExProposto04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int duracao;

        System.out.println("Informe a hora inicial do jogo: ");
        int horaInicial = input.nextInt();

        System.out.println("Informe a hora final do jogo: ");
        int horaFinal = input.nextInt();

        duracao = (horaInicial < horaFinal) ? horaFinal - horaInicial : 24 - horaInicial + horaFinal;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        input.close();
    }
}

//UTILIZACAO DO TERNARIO
