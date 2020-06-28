import java.util.Locale;
import java.util.Scanner;

public class exe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tpA,tpG,tpD,tipo;
		// Tabuada
		System.out.println("Digite o Tipo de Combustivel ");
		tipo = sc.nextInt();
		tpA=0;
		tpG=0;
		tpD=0;
		while (tipo!=4) {
			switch (tipo) {
			case 1:
				tpA += +1 ;
				break;
			case 2:
				tpG += +1 ;
				break;
			case 3:
				tpD += +1 ;
				break;
			case 4:
				//dia="Quarta";
				break;
			default:
				//System.out.println("MUITO OBRIGADO");
				break;
				
			}
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool : " + tpA);
		System.out.println("Gasolina : " + tpG);
		System.out.println("Diesel : " + tpD);
		sc.close();
	}

}
