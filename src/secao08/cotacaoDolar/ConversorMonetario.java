package secao08.cotacaoDolar;

public class ConversorMonetario {
    static final double IMPOSTO = (double) 6 / 100;

    static double dolarToReal(double quantidade) {
        return quantidade + (quantidade * (IMPOSTO));
    }
}
