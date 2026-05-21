package entities;

public class Aluno {
    public String nomeAluno;
    public double notaUm;
    public double notaDois;
    public double notaTres;

    public double notaFinal(){
        return notaUm + notaDois + notaTres;
    }

    public double pontosFaltando() {
        if (notaFinal() < 60) {
            return 60 - notaFinal();
        }
        else return 0;
    }
}
