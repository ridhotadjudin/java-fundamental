package nexsoft.day7_OOP;

//class Person{
//	private int age;
//	
//	private Person() {
//		age = 24;
//	}
//}
//
//public class postTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person p = new Person();
//		System.out.println(p.age);
//	}
//
//}

//class College{
//	private String name = "ite";
//	
//	public String getName() {
//		return name;
//	}
//}
//
//public class postTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		College p = new College();
//		System.out.println(p);
//	}
//
//}

import java.util.*;

//public class postTest {
//	public static void main(String[] args) {
//		String[] array = new String[] { "A", "B", "C" };
//		List<String> list1 = Arrays.asList(array);
//		List<String> list2 = new ArrayList<>(Arrays.asList(array));
//		List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
//		System.out.print(list1.equals(list2));
//		System.out.print(list1.equals(list3));
//	}
//}

public class postTest {
	String berry = "blue";

	public static void main(String[] args) {
		new postTest().juicy("straw");
	}

	void juicy(String berry) {
		this.berry = "rasp";
		System.out.println(berry + "berry");
	}
}
