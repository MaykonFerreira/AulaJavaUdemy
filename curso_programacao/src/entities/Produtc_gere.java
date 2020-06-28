package entities;

public class Produtc_gere {

	private String nome;
	private double price;
	private int qtde;
				
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtde() {
		return qtde;
	}

	public Produtc_gere(String nome, double price, int qtde) {
		//super();
		this.nome = nome;
		this.price = price;
		this.qtde = qtde;
	}
	public Produtc_gere(String nome, double price) {
		//super();
		this.nome = nome;
		this.price = price;

	}

	public void add(int qtde) {
		/* this é usado para instaciar a variavel principar da Classe
		 * quando se usa o mesmo nome ( ex qtde ) 
		 */
		this.qtde += qtde;
	}
	
	public void ret (int qtde) {
		this.qtde -= qtde;
	}
	public double valorestoque() {
		return price * this.qtde;
	}
	public String toString() {
		return nome + " , R$ "
	           + String.format("%.2f", price) + " , " +
				qtde + " unit , total R$ " + String.format("%.2f",valorestoque());
	}
}
