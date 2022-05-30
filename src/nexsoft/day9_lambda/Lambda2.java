package nexsoft.day9_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Lambda2 {

	public static void main(String[] args) {
//		List<String> cars = new ArrayList<>();
//		cars.add("Volvo");
//		cars.add("BMW");
//		cars.add("Honda");
//		
//		cars.forEach(
//			(item) -> System.out.println(item)
//		);
		
		List<Product> lstProduct = new ArrayList<Product>();
		lstProduct.add(new Product(1,"Volvo",2000));
		lstProduct.add(new Product(2,"BMW",3000));
		lstProduct.add(new Product(3,"Honda",2500));
		
		Collections.sort(lstProduct,(item1,item2)->{
			return item1.name.compareTo(item2.name);
		});
		
		//bisa untuk sorting juga
//		for(Product p : lstProduct) {
//			if(p.price>2500) {
//				System.out.printf("ID: %d, Name: %s, Price: %.2f\n",p.id,p.name,p.price);
//			}
//		}
		
		System.out.println("=======================");
		Stream<Product> filter_data = lstProduct.stream().filter(p -> p.price >2400);
		filter_data.forEach(
					item -> System.out.printf("ID: %d, Name: %s, Price: %.2f\n",item.id,item.name,item.price)
				);
//		lstProduct.forEach(
//				(item) -> System.out.println(item)
//		);
		
	}

}
