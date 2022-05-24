package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping18_Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nilai awal : ");
		int i = sc.nextInt();
		System.out.print("Nilai akhir : ");
		int in2 = sc.nextInt();
		int total = 0;
//		
		// for
//		for(int i =in1; i<=in2; i++) {
//			if(i%3==0) {
//				total = total + i;
//				System.out.print(i+" ");
//			}else if (i%5==0) {
//				total = total + i;
//				System.out.print(i+" ");
//			}
//		}

		// while
//		while (i<=in2) {
//			if (i%3==0) {
//				total = total+i;
//				System.out.print(i+" ");
//			} else if (i%5==0) {
//				total = total+i;
//				System.out.print(i+" ");
//			}
//			i++;
//		}

		// do while
		do {
			if (i % 3 == 0) {
				total = total + i;
				System.out.print(i + " ");
			} else if (i % 5 == 0) {
				total = total + i;
				System.out.print(i + " ");
			}
			i++;
		} while (i <= in2);

		System.out.println();
		System.out.println("Total = " + total);

	}

}
