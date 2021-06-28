package lesson2;

public class Product {
	
	public Product() {
		System.out.println("Product adlý constructer çalýþtý");
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this();//bu class ýn (Product) parametresiz olanýnýda çalýþtýrmaya yarar
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
