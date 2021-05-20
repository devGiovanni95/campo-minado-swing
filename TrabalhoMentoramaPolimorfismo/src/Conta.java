
public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;

    /*    public abstract double getSaldo(); como implementamos na conta poupanca uma sobrecarga de polimorfismo
        o sistema nao aceita o saldo como abstrato*/
    public  double getSaldo(){
        return this.saldo;
    }


    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    /*
    public abstract boolean sacar(double quantia);
    como implementamos o saldo na poupanca de acordo com o dia nao podemos
    deixar o sacar como metodo abstrato
     */
    public  boolean sacar(double quantia){
        return false;
    }

    public void depositar(double quantia) { this.saldo += quantia;}
}

