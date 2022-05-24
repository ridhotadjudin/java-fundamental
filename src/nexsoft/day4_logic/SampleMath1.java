package nexsoft.day4_logic;

import java.util.Random;
import java.util.Scanner;

public class SampleMath1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//math operator
		double rand = Math.random();
		System.out.println("rand = "+rand);
		
		int max = 10, min = 1;
		int range = max - min + 1;
		for(int i=0;i<10;i++) {
			int randInt = (int)(Math.random()*range)+min;
			System.out.println("randInt = "+randInt);
		}
		System.out.println();
		System.out.println("///////////////////");
		////////////
		
		double nilai1 = Math.sqrt(9);
		System.out.printf("%.0f",nilai1);
		
		double nilai2 = Math.pow(3, 4); //3 pangkat 4
		System.out.printf("%.0f",nilai2);
		
		
		

	}

}
