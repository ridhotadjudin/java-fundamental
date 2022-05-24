package nexsoft.day4_logic;

public class SampleLogic5_LuasSegitigaMethod {

	public static void luasSegitiga(int alas, int tinggi) {
		double luas = 0.5 * alas * tinggi;
		System.out.printf("%.0f", luas);
	}

	public static void main(String[] args) {

		new SampleLogic5_LuasSegitigaMethod().luasSegitiga(2, 4);

	}

}
