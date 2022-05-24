package nexsoft.weeklyTest_1;

import java.util.Scanner;

//SOAL 8 - 18.1 Loops II

public class week1_soal8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		//input 3
		//input 4
		
		System.out.print("Masukkan angka : ");
	    int input = scan.nextInt();
	    
	    for(int a =1;a<input;a++){
	        for(int b=1;b<=input;b++){
	            if(b==1){
	                System.out.println(a);
	            }else{
	                System.out.println("Text print");
	            }
	        }
	        
	    }

	}

}
