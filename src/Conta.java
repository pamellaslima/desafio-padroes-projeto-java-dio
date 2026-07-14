public class Conta {
    private int saldo;
    private RegraCashback regraCashback;

    public Conta(int saldo, RegraCashback regraCashback) {
        this.saldo = saldo;
        this.regraCashback = regraCashback;
    }

    public void realizarPix(int valor) {
        this.saldo -= valor;
        int cashback = regraCashback.calcularCashback(valor);
        this.saldo += cashback;
        System.out.println("Pix de R$" + valor + " realizado!");
        System.out.println("Você ganhou R$" + cashback + " de cashback!");
        System.out.println("Saldo atual da conta: R$" + saldo);
        System.out.println("-----------------------------------");
    }
}
