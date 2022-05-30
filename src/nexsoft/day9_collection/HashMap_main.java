package nexsoft.day9_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_main {

	public static void main(String[] args) {
		
		Map<Integer,HashMap_mahasiswa> data = new HashMap<Integer,HashMap_mahasiswa>();
	
		HashMap_mahasiswa mhs1 = new HashMap_mahasiswa(20220101,"Raka","Tangerang");
		HashMap_mahasiswa mhs2 = new HashMap_mahasiswa(20220202,"Murdi","Jakarta");
		HashMap_mahasiswa mhs3 = new HashMap_mahasiswa(20220303,"Asep","Bandung");
		
		data.put(1, mhs1);
		data.put(2, mhs2);
		data.put(3, mhs3);
		
//		for(Map.Entry<Integer, HashMap_mahasiswa> m : data.entrySet()) {
//			int key = m.getKey();
//			HashMap_mahasiswa mhs = m.getValue();
//			System.out.println("Data: "+key);
//			System.out.println(mhs.id+" "+mhs.nama+" "+mhs.alamat);
//		}
		
		for(Map.Entry<Integer, HashMap_mahasiswa> m : data.entrySet()) {
			if(m.getKey()==2) {
				int key = m.getKey();
				HashMap_mahasiswa mhs = m.getValue();
				System.out.println("Data: "+key);
				System.out.println(mhs.id+" "+mhs.nama+" "+mhs.alamat);
			}
			
		}
		
		
	
	
	
	}

}
