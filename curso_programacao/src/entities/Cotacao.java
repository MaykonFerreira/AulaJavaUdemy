package entities;

public class Cotacao {
	public static double cot_atual ;
	public static double conversao (int qtde) {
		return (qtde * cot_atual) + ((qtde * cot_atual) * 0.06) ;
	}
}
