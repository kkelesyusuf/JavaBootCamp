package lesson2;

public class Product {
	
	public Product() {
		System.out.println("Product adl� constructer �al��t�");
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this();//bu class �n (Product) parametresiz olan�n�da �al��t�rmaya yarar
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
