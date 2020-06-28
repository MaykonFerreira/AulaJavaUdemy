package entities;

public class Calculadora {
	public  static final double PI = 3.14159;
	public  static double circu (double rad) {
		return 2.0 * PI * rad;
	}
	public static double volume (double rad) {
		return 4.0 * PI * rad * rad * rad / 3.0;
	}
}
