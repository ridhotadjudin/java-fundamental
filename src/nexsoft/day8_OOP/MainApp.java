package nexsoft.day8_OOP;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Product objProduct = new Product();
//		User objUser = new User();
		
//		Product objProduct = new Product();
		User objUser = new User("U001","Ridho","Tangerang");
		Cart objCart = new Cart(objUser);
		
		Product objProduct1 = new Product("B001","Monitor",1000000);
		Product objProduct2 = new Product("B002","RAM",400000);

		objCart.add(objProduct1);
		objCart.add(objProduct2);
//		objCart.add(new Product("B003","SSD",700000));
		
		objUser.print();
		objProduct1.print();
		objProduct2.print();
		System.out.println("Total = "+objCart.getTotal());
		
//		System.out.print("Masukkan ID User  : ");
//		String inUser1 = sc.nextLine();
//		System.out.print("Masukkan Nama User: ");
//		String inUser2 = sc.nextLine();
//		System.out.print("Masukkan Kota     : ");
//		String inUser3 = sc.nextLine();
//		
//		System.out.print("Masukkan ID Barang   : ");
//		String input1 = sc.nextLine();
//		System.out.print("Masukkan Nama Barang : ");
//		String input2 = sc.nextLine();
//		System.out.print("Masukkan Harga Barang: ");
//		double input3 = sc.nextDouble();
		
//		objProduct.setId(input1);
//		objProduct.setNama(input2);
//		objProduct.setHarga(input3);
//		objProduct.print();
//		
		
	}

}
