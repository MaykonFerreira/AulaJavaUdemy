package entities;

public class Retangulo {
	public double X;
	public double Y;
	
	public double area() {
		return X * Y;
		}
		public double perimeter() {
		return 2 * (X + Y);
		}
		public double diagonal() {
		return Math.sqrt(X * X + Y * Y);
		}
}
