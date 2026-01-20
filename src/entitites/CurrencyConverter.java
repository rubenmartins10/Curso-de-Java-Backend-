package entitites;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double conversao(double amount, double dollarPrice) {
        // Valor total = (Quantidade * Preço) * (1 + 0.06 de imposto)
		return amount * dollarPrice * (1.0 + IOF);
	}
}