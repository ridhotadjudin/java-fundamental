package nexsoft.day9_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();
		
		System.out.print("Berapa data? : ");
		int loop = sc.nextInt();
		boolean cek=true;
		
		for(int i=0;i<loop;i++) {
			sc.nextLine(); //MUST DO
			System.out.print("Masukkan nama mobil: ");
			String in1= sc.nextLine();
			System.out.print("Masukkan tipe mobil: ");
			String in2=sc.nextLine();
			if(in1.isEmpty() || in2.isEmpty()) {
				System.out.println("Invalid Input");
				cek = false;
				break;
			}
			System.out.print("Masukkan kecepatan maks: ");
			int in3 = sc.nextInt();
			cars.add(new Car(in1,in2,in3));
		}
		if(cek==true) {
			System.out.println();
			System.out.println("=====DATA MOBIL=====");
			for(Car car: cars) {
				car.print();
			}
			System.out.println("Total Mobil: "+cars.size());
		}
		
	}

}
