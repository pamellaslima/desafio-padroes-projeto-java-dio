public class CashbackOuro implements RegraCashback {
    @Override
    public int calcularCashback(int valorPix) {
        return (int) (valorPix * 0.10); // 10% de cashback
    }
}