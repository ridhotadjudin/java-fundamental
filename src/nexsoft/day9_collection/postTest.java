package nexsoft.day9_collection;

import java.util.LinkedList;
import java.util.Scanner;

public class postTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> lnkList = new LinkedList<>();

		lnkList.add("Volvo");
		lnkList.add("BMW");
		lnkList.add("Ford");
		System.out.println(lnkList);
		
		tambah("Mazda", lnkList);
		System.out.println(lnkList);
		
	}
	
	public static String tambah(String nama, LinkedList kata) {
		kata.addFirst(nama);
		return nama;
	}

}
