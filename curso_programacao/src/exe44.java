import java.util.Locale;
import java.util.Scanner;

public class exe44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N,i,F;
		N = sc.nextInt();
		F = 0;
		for (i = (N-1); i != 0 ; i--) {
	
			if (i==(N-1)) {
				F = N * i;
				System.out.print(N + " = ");
			}
			else
			{
				F = F * i;	
			}
			
			System.out.print("(" + N + " * " + i + ") + " );

		}
		System.out.print("= " + F);
		sc.close();
	}

}
