package nexsoft.day6_function;

import java.util.Scanner;

public class SampleStringBuffer {

	public static void main(String[] args) {

//		StringBuffer sb = new StringBuffer("Salam");
//		sb.append(" Sapa");
//
////		sb.append(" Sayang");
//		sb.insert(10, " Sayang");  // indeks posisi mulai
//		
//		sb.replace(15, 17, " gil");
//		//out Salam Sapa Saya gil
//		
//		sb.delete(15, 19);
//		//Salam sapa Saya
//		
//		sb.reverse();
//		
//		System.out.println(sb);
//		// output Salam Sapa Sayang
		
		Scanner sc = new Scanner(System.in);
		StringBuffer strB = new StringBuffer("");
		
		System.out.print("Berapa kata : ");
		int input = sc.nextInt(); sc.nextLine();
		for(int i=0;i<input;i++) {
			System.out.print("Kata "+(i+1)+" : ");
			String in = sc.nextLine();
			strB.append(in);
		}
		
		System.out.println();
		System.out.println("Hasil     : "+strB);
		System.out.println("Reverse   : "+strB.reverse());
		System.out.println("Hapus 5-10: "+strB.delete(4,9));
		
		
	}

}
