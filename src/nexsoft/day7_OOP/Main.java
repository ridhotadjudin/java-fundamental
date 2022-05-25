package nexsoft.day7_OOP;

import nexsoft.sasaranOOP.Drone;
import nexsoft.sasaranOOP.PraktekModifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classPertama objekKelasPertama = new classPertama();
		int hasil = objekKelasPertama.perhitungan(2, 3);
		System.out.println(hasil);
		
		PraktekModifier objekModifier = new PraktekModifier();
		objekModifier.setNama("mantap");
		objekModifier.printTest();
		System.out.println(objekModifier.getNama());
		
		Drone drone = new Drone("tipe","Kuning",200);
		System.out.println(drone.getTipeDrone());
		
		
		
//		drone.setTipeDrone("Mantap441");
//		drone.setWarna("Biru");
//		drone.setSpeed(600);
//		System.out.println(drone.getTipeDrone());
//		System.out.println(drone.getWarna());
//		System.out.println(drone.getSpeed()+" cc");
//		
//		drone.cekKecepatan();
	}

}
