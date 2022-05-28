package nexsoft.day8_OOP;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<Product> products;
	User konsumen;
	
	public Cart(User konsumen) {
		this.konsumen = konsumen;
		products = new ArrayList<Product>();
	}
	
	public void add(Product item) {
		products.add(item);
	}
	
	public void remove(Product item) {
		products.remove(item);
	}
	
	public double getTotal() {
		double sum = 0.0;
		for(Product item : products) {
			sum += item.getHarga();
		}
		return sum;
	}
}
