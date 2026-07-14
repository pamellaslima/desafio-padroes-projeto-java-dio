public class Main {
    public static void main(String[] args) {
        // 1. Criamos os nossos moldes de cashback (as estratégias)
        RegraCashback regraNormal = new CashbackNormal();
        RegraCashback regraPlatina = new CashbackPlatina();
        RegraCashback regraOuro = new CashbackOuro();

        // 2. Criamos uma conta Normal com R$ 1000 de saldo inicial
        System.out.println("=== TESTANDO CONTA NORMAL ===");
        Conta contaNormal = new Conta(1000, regraNormal);
        contaNormal.realizarPix(100); // Deve ganhar 1% de R$100 = R$1

        // 3. Criamos uma conta Platina com R$ 1000 de saldo inicial
        System.out.println("=== TESTANDO CONTA PLATINA ===");
        Conta contaPlatina = new Conta(1000, regraPlatina);
        contaPlatina.realizarPix(100); // Deve ganhar 5% de R$100 = R$5

        // 4. Criamos uma conta Ouro com R$ 1000 de saldo inicial
        System.out.println("=== TESTANDO CONTA OURO ===");
        Conta contaOuro = new Conta(1000, regraOuro);
        contaOuro.realizarPix(100); // Deve ganhar 10% de R$100 = R$10
    }
}