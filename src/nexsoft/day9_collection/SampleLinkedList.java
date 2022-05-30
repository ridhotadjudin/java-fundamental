package nexsoft.day9_collection;

import java.util.LinkedList;

public class SampleLinkedList {

	public static void main(String[] args) {
		LinkedList<String> lnkList = new LinkedList<>();
		
		lnkList.add("Data 1");
		lnkList.add("Data 2");
		lnkList.add("Data 3");
		lnkList.add("Data 4");
		lnkList.add("Data 5");
		System.out.printf("Output: %s \nUkuran: %s\n",lnkList,lnkList.size());
		
		lnkList.addFirst("Data 0");
		lnkList.addLast("Data 6");
		System.out.printf("Output: %s \nUkuran: %s\n",lnkList,lnkList.size());
		
		lnkList.set(0,"Data 11");
		lnkList.set(6,"Data 12");
		System.out.printf("Output: %s \nUkuran: %s\n",lnkList,lnkList.size());
		
		lnkList.removeFirst();
		lnkList.removeLast();
		System.out.printf("Output: %s \nUkuran: %s\n",lnkList,lnkList.size());

		lnkList.remove(3);
		System.out.printf("Output: %s \nUkuran: %s\n",lnkList,lnkList.size());

	}
}
