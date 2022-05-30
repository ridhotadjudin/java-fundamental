package nexsoft.training_week2;

import java.util.Scanner;

public class TrainingWeek2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*
		 * Intel
		 * Gigabyte
		 * 4096
		 * 1
		 * Nvidia
		 * Seagate
		 * 
		 * AMD
		 * MSI
		 * 2048
		 * 2
		 * Radeon
		 * WDC
		 */
		
		System.out.print("Masukkan Processor: ");
		String ps = sc.nextLine();
		System.out.print("Masukkan Motherboard: ");
		String mb = sc.nextLine();
		System.out.print("Masukkan RAM: ");
		int ram = sc.nextInt();
		System.out.print("Masukkan Keping RAM: ");
		int slot = sc.nextInt();
		sc.nextLine();
		System.out.print("Masukkan GPU: ");
		String gpu = sc.nextLine();
		System.out.print("Masukkan Harddisk: ");
		String hdd = sc.nextLine();
		
		System.out.println();
		Computer computer1 = new Computer(ram,slot,gpu,hdd,mb,ps);
		computer1.displaySpec();

	}

}

class Computer {
	int ram;
	int slot;
	String gpu;
	String harddisk;
	String motherboard;
	String processor;
	
	public Computer(int ram, int slot, String gpu, String hdd, String mb, String ps){
	    this.ram=ram;
	    this.slot=slot;
	    this.gpu=gpu;
	    this.harddisk=hdd;
	    this.motherboard=mb;
	    this.processor=ps;
	}
	
	public void displaySpec(){
	    System.out.printf("Processor: %s, Motherboard: %s, RAM: %dx%d, GPU: %s, Harddisk: %s",processor,motherboard,ram,slot,gpu,harddisk);
	}
}
