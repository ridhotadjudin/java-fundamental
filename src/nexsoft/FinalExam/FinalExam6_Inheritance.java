package nexsoft.FinalExam;

// INHERITANCE

import java.util.Scanner;

import nexsoft.day7_OOP.Main;

public class FinalExam6_Inheritance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Main computer = new Main();
		
		System.out.print("String Processor: ");
		String ps = sc.nextLine();
		System.out.print("String Motherboard: ");
		String mb = sc.nextLine();
		System.out.print("Int RAM: ");
		int ram = sc.nextInt();
		System.out.print("Int Slot: ");
		int slot = sc.nextInt();
		sc.nextLine();
		System.out.print("String GPU: ");
		String gpu = sc.nextLine();
		System.out.print("String Harddisk: ");
		String hdd = sc.nextLine();

		Computer computer1 = new Computer(ram, slot, gpu, hdd, mb, ps);
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

	public Computer(int ram, int slot, String gpu, String hdd, String mb, String ps) {
		this.ram = ram;
		this.slot = slot;
		this.gpu = gpu;
		this.harddisk = hdd;
		this.motherboard = mb;
		this.processor = ps;
	}

	public void displaySpec() {
		System.out.println("Processor: " + processor);
		System.out.println("Motherboard: " + motherboard);
		System.out.println("RAM: " + ram + "x" + slot);
		System.out.println("GPU: " + gpu);
		System.out.println("Harddisk: " + harddisk);
	}
}
