package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 9 - 18.2 While Loops

public class week1_soal9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		//input 10 20 2
		//input 80 100 3
		int a=0,b=0,c=0;
		System.out.println("Deret aritmatika");
		System.out.print("angka awal  : ");
	    a = scan.nextInt();
	    System.out.print("angka akhir : ");
	    b = scan.nextInt();
	    System.out.print("kelipatan   : ");
	    c = scan.nextInt();
	    int hasil;
	    
	    for(int i = 0;(i+a)<=b;i+=c){
	        hasil = a + i;
	        System.out.print(hasil+" ");
	    }

	}

}
