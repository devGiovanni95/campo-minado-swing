public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }



    public double getSaldo() {
        return this.saldo + this.taxaDeJuros * this.saldo;
//        if (dia >= this.diaAniversario) {
//           /*
//            return this.saldo + this.taxaDeJuros * this.saldo;
//            this.saldo *= this.taxaDeJuros;
//            this.saldo = this.saldo * this.taxaDeJuros;
//            */
//            return this.saldo + this.taxaDeJuros * this.saldo;
//
//        } else {
//            return this.saldo;
//        }
    }

    @Override
    public boolean sacar(double quantia) {
        this.saldo = this.saldo - quantia;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}


