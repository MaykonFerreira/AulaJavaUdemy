import java.util.Locale;
import java.util.Scanner;

public class exe50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int Maior= max(a,b,c);
		
		exibir(Maior);
		System.out.println("Fatorial do Maior : " + Fatorial(Maior));
		sc.close();
	}
	
	public static int  max (int x, int y, int z){
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if ( y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	public static void exibir (int value) {
		System.out.println("Maior Nº " + value);
	}
	public static int Fatorial (int FT) {
		int N,i,F;
		N = FT;
		F = 0;
		for (i = (N-1); i != 0 ; i--) {
			if (i==(N-1)) {
				F = N * i;
			}
			else
			{
				F = F * i;	
			}
		}
		return F ;
	}
}
