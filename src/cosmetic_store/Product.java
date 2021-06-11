package cosmetic_store;

public class Product {
	long id;
	String name;
	String brand;
	int quntity;
	float price;
	
	public Product(long id, String name, String brand, int quntity, float price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.quntity = quntity;
		this.price = price;
	}
	
	
	public void display() { //int id, String name, String brand, int quntity, float price
		System.out.println("**********************************");
		System.out.println("Product Id: "+id);
		System.out.println("Product Name: "+name);
		System.out.println("Product brand: "+brand);
		System.out.println("Product quantity: "+ quntity);
		System.out.println("Product price: "+price);
		System.out.println("**********************************");
	}

}
