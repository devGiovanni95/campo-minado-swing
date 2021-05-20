public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public boolean sacar(double quantia) {
        double disponivel = this.chequeEspecial + this.saldo;
        if (quantia > disponivel){
            System.out.println("Você não tem limite disponivel. ");
            return false;
        }else{
            this.saldo =  this.saldo - quantia;
            return true;
        }
    }

    @Override
    public double getSaldo() {
        return this.chequeEspecial + this.saldo;
    }
}
