package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 10 - 18.4 Loops Output Formater

public class week1_soal10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//input
		//salam 150
		//sang 80
		//juara 70
		
		String kata[] = new String[3];
		int angka[] = new int[3];
		
		for (int i = 0; i < 3; i++) {
            kata[i] = sc.next();
            angka[i] = sc.nextInt();
        }
		
		System.out.println("==============================");
		System.out.printf("%-15s%03d\n",kata[0],angka[0]);
		System.out.printf("%-15s%03d\n",kata[1],angka[1]);
		System.out.printf("%-15s%03d\n",kata[2],angka[2]);
		System.out.println("==============================");
		

	}

}
