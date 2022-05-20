package com.nexsoft.day2_decision;

public class tugasDay2 {

	public static void main(String[] args) {
//		boolean STNK = true;
//
//		boolean SIM = false;
//		
//		if(SIM == true){
//
//			if( STNK == true ) {
//
//			System.out.println("Tidak ditilang!");
//
//			}
//
//			} else {
//
//			System.out.println("Anda ditilang!");
//
//			}
		/////////
//		int nilai = 85;
//
//		 
//
//		switch(nilai){
//
//		case 90:
//
//		System.out.println("A");
//
//		break;
//
//		case 80:
//
//		System.out.println("B");
//
//		break;
//
//		case 70:
//
//		System.out.println("C");
//
//		break;
//
//		default:
//
//		System.out.println("Nilai salah");
//
//		}
		/////////
		
		int nilai = 85;

        String level;

 

        if(nilai >= 90){

            level = "A";

        }else if(nilai >= 80){

            level = "B";

        }else if(nilai >= 70){

            level = "C";

        }else if(nilai >= 60){

            level = "D";

        }else{

            level = "E";

        }

        System.out.println("Raport Anda : " + level);

	}

}
