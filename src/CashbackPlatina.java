public class CashbackPlatina implements RegraCashback {
    @Override
    public int calcularCashback(int valorPix) {
        return (int) (valorPix * 0.05);
    }
}
