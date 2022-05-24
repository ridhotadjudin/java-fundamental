package nexsoft.day4_logic;

import java.util.Random;

public class SampleMath2 {

	public static void main(String[] args) {
		double r = Math.sqrt(2);
		System.out.println(r);
		
		System.out.print("Random Number = ");
		Random random = new Random();
		for(int i=0;i<10;i++) {
			int randomNumber = random.nextInt(100);
			System.out.print(randomNumber+" ");
		}
		System.out.println();
		System.out.println("////////////////");
		//////////
		
		String teks1 = "nexsoft juara";
		System.out.println(teks1.substring(12,13));
		System.out.println(teks1.substring(1,4));
		System.out.println(teks1.substring(4,7));

	}

}
