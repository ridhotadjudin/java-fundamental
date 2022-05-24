package nexsoft.day5_array;

import java.util.Arrays;
import java.util.Scanner;

public class SampleArray4_LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// linear search

		int data[] = { 95, 100, 80, 90, 95 };

		System.out.print("Angka yang dicari : ");
		int key = sc.nextInt();

		for (int i = 0; i < data.length; i++) {
			if (data[i] == key) {
				System.out.printf("%d berada di index %d", key, i + 1);
			}
		}
		System.out.println();

		System.out.println("/////////////////////");
		//////////////

		int insertAt = 3;
		int data1[] = { 1, 2, 3, 4, 5, 6 };
		int data2[] = { 7, 8 };
		int data3[] = new int[data1.length + data2.length];

		for (int i = 0; i < insertAt; i++) { // 0-2
			data3[i] = data1[i]; // data3[0]=data1[2]
		}
		for (int j = insertAt; j < insertAt + data2.length; j++) { // 3-4
			data3[j] = data2[j - insertAt]; // data3[3]=data2{0]
		}
		for (int k = insertAt + data2.length; k < data3.length; k++) { // 5-7
			data3[k] = data1[k - data2.length]; // data3[5]=data1[3]
		}

		for (int i = 0; i < data3.length; i++) {
			System.out.print(data3[i] + " ");
		}

		// 1,2,3,7,8,4,5,6

	}

}
