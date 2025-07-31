package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double calculoDolar(double precoDolar, double compraDolar) {
		double valorTotalDolar = precoDolar * compraDolar;
		return valorTotalDolar * IOF + valorTotalDolar;
	}
	
}
