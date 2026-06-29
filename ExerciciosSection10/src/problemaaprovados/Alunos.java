package problemaaprovados;

public class Alunos {
    private String nome;
    private double nota1;
    private double nota2;

    public Alunos(){}

    public Alunos(String nome, double nota2, double nota1) {
        this.nome = nome;
        this.nota2 = nota2;
        this.nota1 = nota1;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}
