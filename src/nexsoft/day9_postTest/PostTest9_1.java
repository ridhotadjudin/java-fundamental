package nexsoft.day9_postTest;

import java.util.LinkedList;

public class PostTest9_1 {

	public static void main(String[] args) {

		LinkedList<String> lnkList = new LinkedList<>();

		lnkList.add("Volvo");
		lnkList.add("BMW");
		lnkList.add("Ford");

		lnkList.addFirst("Mazda");
		System.out.println(lnkList);

	}

}
