package entities;

import java.util.Date;

public class Product_Order {
     private Date date;
     public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
		this.product.nome = "GELADEIRA";
	}
	private Product product;
	public Product_Order(Date date, Product product) {
		//super();
		this.date = date;
		this.product = product;
	}
}
