package nexsoft.day9_collection;

import java.util.HashSet;

public class SampleHashSet {

	public static void main(String[] args) {
		
		HashSet data = new HashSet();
		
		data.add(1);
		data.add(3);
		data.add(2);
		data.add(1);
		//autosort
		
		System.out.println(data);
		System.out.println(data.size());

		data.remove(1); //menghapus nilai
		System.out.println(data);
		System.out.println(data.size());

	}

}
