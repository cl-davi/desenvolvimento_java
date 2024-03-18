package IntroducaoAProgramacaoOrientadaAObjetos.Exercicios.ComprarDolares;

public class CurrencyConverter {
    public static double dollarPrice;
    public static final double tax = 0.06;

    public static double totalValue(double quantity) {
        return quantity * dollarPrice + (quantity * dollarPrice * tax);
    }
}
