package nexsoft.day9_postTest;

import java.util.ArrayList;

public class PostTest9_2 {

	public static void main(String[] args) {

		ArrayList<String> kata = new ArrayList<String>();
		kata.add("hanip");
		kata.add("cakep");
		System.out.println("Ini adalah output pertama : " + kata);

		kata.set(0, "saya");
		System.out.println("Ini adalah output kedua : " + kata);

	}

}
