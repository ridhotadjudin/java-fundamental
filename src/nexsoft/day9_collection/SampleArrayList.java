package nexsoft.day9_collection;

import java.util.ArrayList;
import java.util.Collections;

public class SampleArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		
		Collections.sort(cars);
		System.out.println(cars);
		
//		cars.set(0, "Toyota");
//		System.out.println(cars);
//		cars.remove(3);
//		System.out.println(cars);
//		System.out.println("Jumlah data: "+cars.size());
//		
//		//for each
//		for(String listCar : cars) {
//			System.out.println(listCar);
//		}
//		
//		cars.clear();
//		System.out.println(cars);
		
		
	}

}
