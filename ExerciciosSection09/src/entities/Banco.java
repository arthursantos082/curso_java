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

    public Banco(int numConta, String nomeDono, double depositoInicial) {
        this.numConta = numConta;
        this.nomeDono = nomeDono;
        //this.saldo = deposito; -> se a regra de negocio do deposito mudar, se torna necessario o que segue:
        //apenas um ponto de alteracao (o metodo)
        depositarSaldo(depositoInicial);
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

    /*
    erro 1
    na verdade deveria apenas ser feito o get (so pode mudar atraves de metodos)
    public void setSaldo(double deposito) {
        this.saldo = deposito;
    }
    */


    // realiza o deposito
    public void depositarSaldo(double deposito){
        // o "this" nao se torna mais necessario em funcao da inexistencia de um saldo como parametro
        saldo += deposito;
    }

    // realiza o saque
    public void sacarSaldo(double saque){
        // por convencao eu utilizei dois parametros diferentes de quantia em funcao de melhor leitura do codigo
        saldo -= (saque + 5.0);
    }

    @Override
    public String toString() {
        return "numero da conta=" + numConta +
                ", nome do dono='" + nomeDono + '\'' +
                ", saldo=" + String.format("%.2f", saldo)  +
                '}';
    }
}
