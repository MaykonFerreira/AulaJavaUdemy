import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String msg1,msg2,nome;
		int idade = 31;
		double renda = 4000.0;
		msg1 = "Olá Mundo !";
		msg2 ="Bom Dia !";
		nome = "Maria";
		System.out.println(msg1);
		System.out.println(msg2);
		// Configurar o Programa para um Idioma
		Locale.setDefault(Locale.US);
		//System.out.print(Locale.US);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);
		
		
	}

}
