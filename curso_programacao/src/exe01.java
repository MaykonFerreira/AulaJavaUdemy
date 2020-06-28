import java.util.Locale;

public class exe01 {

	public static void main(String[] args) {
		String procuct1 = "Computer";
		String procuct2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1=2100.0;
		double price2=650.50;
		double measure=53.234567;
		
		
		System.out.printf("Products: %n%s whitch price is $ %.2f %n",procuct1,price1);
		System.out.printf("%s whitch price is $ %.2f %n %n",procuct2,price2);
		System.out.printf("Record %d years old, code %d and gender : %s %n %n",age,code,gender);
		
		System.out.printf("Mease with eight decimal places : %.8f %n",measure);
		System.out.printf("Ouded (three decimal places : %.3f %n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point : %.3f",measure);
		
		//System.out.println(msg2);
		// Configurar o Programa para um Idioma
		//Locale.setDefault(Locale.US);
		//System.out.print(Locale.US);
		//System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);

	}

}

