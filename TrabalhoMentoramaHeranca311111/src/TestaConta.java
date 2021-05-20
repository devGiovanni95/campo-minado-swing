public class TestaConta {
    public static void main(String[] args) {
        Conta contas[] = new Conta[3];

        ContaCorrente cc = new ContaCorrente(1, 1, "Banco 1 ", 100, 1000);
        ContaPoupanca cp = new ContaPoupanca(1, 1, "Banco 1 ", 100, 20, 0.05);
        ContaSalario cs = new ContaSalario(1, 1, "Banco 1 ", 1000, 3);




        System.out.println(cp);
        cp.depositar(400);
        System.out.println(cp);
        System.out.println("O saldo atual é: " + cp.getSaldo(25));

    }
}
