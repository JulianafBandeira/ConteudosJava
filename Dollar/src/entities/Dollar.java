package entities;

public class Dollar {
	public static double price;
	public static double compra;

	public static double many(double price, double compra) {
		return compra * price;
	}

	public static double amount(double price, double compra) {
		double total = many(price, compra);
		double tax = total * 0.06;
		return total + tax;

	}
	
}
