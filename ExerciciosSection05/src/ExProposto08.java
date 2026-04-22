/*
 Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
 que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
 qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

 Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
 mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExProposto08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        double valImposto = 0;
        double sepSalario = 0;

        System.out.println("INFORME O SALARIO DO INDIVIDUO: ");
        double salario = input.nextDouble();

        if (salario < 2000.0) {
            System.out.println("Isento");
        }
        else if (salario < 3000.0) {
            valImposto = (salario - 2000) * 0.08;
        }
        else if (salario < 4500.0) {
            sepSalario = (salario - 3000);
            valImposto = (salario - 2000 - sepSalario) * 0.08 + sepSalario * 0.18;
        }
        else {
            sepSalario = (salario - 4500);
            valImposto = (salario - 3500 - sepSalario) * 0.08 + (salario - 3000 - sepSalario) * 0.18 + (sepSalario * 0.28);
        }

        System.out.printf("R$ %.2f", valImposto);
        input.close();
    }
}


/*
esse exercicio me gerou uma confusao imensa
nao imaginei que eu poderia multiplicar as faixas entao fiz uma variavel para cada
felizmente eu entendi como os intervalos funcionavam... entao ao olhar a correcao
meu codigo so ficou maior mesmo...
*/

// SECTION 05 CONCLUIDA

// MEMENTO MORI.