package entities;

public class Calculator {
	public  final double PI = 3.14159;
	public  double circu (double rad) {
		return 2.0 * PI * rad;
	}
	public double volume (double rad) {
		return 4.0 * PI * rad * rad * rad / 3.0;
	}
}
