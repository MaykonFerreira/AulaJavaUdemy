package application;

public class aula14_boxing_unbocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =20;
		Object obj = x;
		// Casting
		int y = (int) obj;
		System.out.println("Valor de X : " + x);
		System.out.println("Valor de OBJ : " + obj);
		System.out.println("Valor de Y : " + y);
	}

}
