import java.util.Locale;
import java.util.Scanner;

public class exe38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int qtden,soma,I,n;
		// Tabuada
		System.out.println("Digite a qtde Nros a serem digitados ");
		qtden = sc.nextInt();
		soma=0;
		for (I=1 ; I <= qtden ; I ++){
			n = sc.nextInt();
			soma += n;
		}
		System.out.println("Soma : " + soma);

		sc.close();
	}

}
