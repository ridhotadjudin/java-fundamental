package nexsoft.sasaranOOP;

import nexsoft.day6_function.SampleFunction8;
import nexsoft.day6_function.SampleFunction9;

public class test extends SampleFunction8 {

	public static void main(String[] args) {
		
		SampleFunction8 impor_8 = new SampleFunction8();
		SampleFunction9 impor_9 = new SampleFunction9();
		
//		impor_8.testProtected();
		impor_8.display();
		System.out.println("----------------");
		impor_9.main(args);
		
		System.out.println();
		System.out.println("//////////////////");
		/////////////////////////////
	}
	
	public void testProtected() {
		System.out.println(super.luasPersegi(10));
	}

}
