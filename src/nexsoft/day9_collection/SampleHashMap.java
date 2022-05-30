package nexsoft.day9_collection;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> ibuKota = new HashMap<String, String>();
		
		ibuKota.put("Indonesia", "Jakarta");
		ibuKota.put("Singapore", "Singapore");
		ibuKota.put("Malaysia", "Kuala Lumpur");
		ibuKota.put("Philipine", "Manila");
		ibuKota.put("Thailand", "Bangkok");
		
		System.out.println(ibuKota);
		
//		for(String i : ibuKota.keySet()) {
//			System.out.printf("Key: %s, Value: %s\n",i,ibuKota.get(i));
//		}
		
		
		for(Map.Entry m : ibuKota.entrySet()) {
			if(m.getKey().equals("Indonesia")) {
				System.out.printf("Key: %s, Value: %s\n",m.getKey(),m.getValue());
			}
		}
		
		
	}

}
