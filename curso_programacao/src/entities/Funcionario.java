package entities;

public class Funcionario {
	public String nome;
	public double Sal;
	public double taxa;
	
	public void add(double Sal) {
		/* this é usado para instaciar a variavel principar da Classe
		 * quando se usa o mesmo nome ( ex qtde ) 
		 */
		this.Sal += ((this.Sal * Sal)/100);
	}
	public void ret (double Sal) {
		this.Sal -= ((this.Sal * Sal)/100);
	}

	public String toString() {
		return nome + " , R$ " + String.format("%.2f", (Sal-taxa)) ;
	}
}
