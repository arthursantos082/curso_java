package entities;

public class Banco {
    private int numConta;
    private String nomeDono;
    private double saldo;

    // constructors
    public Banco (){}

    public Banco (int numConta, String nomeDono){
        this.numConta = numConta;
        this.nomeDono = nomeDono;
    }

    public Banco(int numConta, String nomeDono, double deposito) {
        this.numConta = numConta;
        this.nomeDono = nomeDono;
        this.saldo = deposito;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double deposito) {
        this.saldo = deposito;
    }


    //altera o valor do deposito
    public void depositarSaldo(double deposito){
        this.saldo += deposito;
    }

    public void sacarSaldo(double saque){
        this.saldo -= (saque + 5.0);
    }

    @Override
    public String toString() {
        return "numero da conta=" + numConta +
                ", nome do dono='" + nomeDono + '\'' +
                ", saldo=" + String.format("%.2f", saldo)  +
                '}';
    }
}
