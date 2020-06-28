import java.util.Locale;
import java.util.Scanner;

public class exe41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int vIN,vOut,I,N,X;
		// Tabuada
		//System.out.println("Digite o Tipo de Combustivel ");
		N = sc.nextInt();
        vIN  = 0;
        vOut = 0;
        I = 0;
		while (I!=N) {
			X = sc.nextInt();
			if (X >= 10 && X <=20) {
				vIN ++;
			}
			else {
				vOut ++;
			}
			
			I++;	
		 }
		 System.out.printf("%d in %n",vIN);
		 System.out.printf("%d out",vOut);
		 sc.close();
	}

}
