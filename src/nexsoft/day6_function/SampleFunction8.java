package nexsoft.day6_function;

class BangunDatar {
	static double luasPersegi(double sisi) {
		double luas = sisi*sisi;
		return sisi*sisi;
	}
	
	protected static double luasSegitiga(double alas, double tinggi) {
		return 0.5*alas*tinggi;
	}
}

public class SampleFunction8 {

	public static void main(String[] args) {
		
		System.out.println(BangunDatar.luasPersegi(10));
		System.out.println(BangunDatar.luasSegitiga(10, 10));

	}
	
	public void display() {
		System.out.println("Teks display");
	}
	
	public double luasPersegi(double sisi) {
		return sisi*sisi;
	}

//	private void testProtected() {
//		System.out.println(luasPersegi(10));
//	}
	
}
