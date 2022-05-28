package nexsoft.advancedTest_1;

public class AdvancedTest1_6 {

	public static void main(String[] args) {
		
		int input1=12;
		int input2=1234;
		
		if(input1%2==0){
	        //genap
	        if(input2%2==0){
	            System.out.println("Tanggal genap dan plat nomor genap");
	        }else{
	            System.out.println("Tanggal genap dan plat nomor ganjil");
	        }
	    }else{
	        if(input2%2==0){
	            System.out.println("Tanggal ganjil dan plat nomor genap");
	        }else{
	            System.out.println("Tanggal ganjil dan plat nomor ganjil");
	        }
	    }

	}

}
