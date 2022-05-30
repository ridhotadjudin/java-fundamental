package nexsoft.day9_exceptionhandling;

public class SampleException1 {

	public static void main(String[] args) {
		
//		try {
//			int hasil = 1/0;
//			System.out.println("Statemen: ");
////		}catch(Exception e){
//////			System.err.println("-->"+e);
////			System.out.println("Tidak bisa dibagi 0");
//		}finally {
//			System.out.println("ini finally");
//		}
//		System.out.println();
//		System.out.println("Program try catch selesai");
		
		/////////////////
		
//		int a=1,b=0;
//		try {
//			int hasil = a/b;
//		} catch (Exception e) {
//			System.out.println("Hasil catch: "+a/(b+1));
//		}
		
		/////////////////
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		////////////////
		
		int angka[] = {10,20,30,40};
		try {
			System.out.println(angka[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("-->>"+e);
		}finally {
			System.out.println("Cek length: "+angka.length);
		}
		System.out.println("Ini sisa kode");
		
		
	}

}
