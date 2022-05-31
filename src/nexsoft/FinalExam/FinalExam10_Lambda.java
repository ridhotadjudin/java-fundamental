package nexsoft.FinalExam;

// LAMBDA

import java.util.Scanner;

interface BangunDatar {
    public void print();
}

public class FinalExam10_Lambda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		/*
		 * 1
			Monitor
			3000
			2
			Keyboard
			150
			
			1
			Yamaha
			21000
			2
			Honda
			19000
		 */
		
		System.out.print("Input ID 1: ");
	    int id1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Input Barang 1: ");
		String barang1 = sc.nextLine();
		System.out.print("Input Harga 1: ");
		double harga1 = sc.nextDouble();
		
		System.out.print("Input ID 2: ");
		int id2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Input Barang 2: ");
		String barang2 = sc.nextLine();
		System.out.print("Input Harga 2: ");
		double harga2 = sc.nextDouble();
		
		
		BangunDatar kar1 = () -> System.out.printf("%d %s %.1f\n",id1,barang1,harga1);
		BangunDatar kar2 = () -> System.out.printf("%d %s %.1f\n",id2,barang2,harga2);
		
		kar2.print();
		kar1.print();

	}

}
