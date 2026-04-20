import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String nome = "Arthur";
        int idade = 18;
        double renda = 1621.05;

        System.out.printf("%s tem %d anos com renda de R$%.2f\n", nome, idade, renda);
    }
}
