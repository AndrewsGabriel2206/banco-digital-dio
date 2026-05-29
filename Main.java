public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Andrews Gabriel");
        Cliente cliente2 = new Cliente("Maria Silva");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.depositar(1000);
        cc.transferir(300, cp);

        cc.imprimirExtrato();
        System.out.println();
        cp.imprimirExtrato();
    }
}
