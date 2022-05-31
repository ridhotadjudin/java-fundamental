package nexsoft.FinalExam;

// CLASS AND OBJECT

import java.util.Scanner;

public class FinalExam4_ClassObject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		AkunTabungan akun1 = new AkunTabungan();
		
		/*
		 * 112233
		 * Budi
		 * 1000
		 * 
		 * 223344
		 * Angga
		 * 5000
		 */
		
		System.out.print("Input ID: ");
		int in1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Input Name: ");
		String in2 = sc.nextLine();
		System.out.print("Input Balance: ");
		double in3 = sc.nextDouble();
		
		akun1.tambahAkun(in1, in2, in3); 
		akun1.displayAkun();
		akun1.cekSaldo();
		akun1.simpanTabungan(50000);
		akun1.cekSaldo();
		akun1.ambilTabungan(25000);
		akun1.cekSaldo();

	}

}

class AkunTabungan {
	int id;
	String nama;
	double saldo;

	public AkunTabungan() {
		id = 0;
		nama = "";
		saldo = 0;
	}

	public void tambahAkun(int id, String nama, double saldo) {
		this.id = id;
		this.nama = nama;
		this.saldo = saldo;
	}

	public void displayAkun() {
		System.out.println(id + " " + nama + " " + saldo);
	}

	public void cekSaldo() {
		System.out.printf("Saldo: %.1f\n", saldo);
	}

	public double simpanTabungan(double in) {
		saldo += in;
		System.out.println(in + " simpan tabungan");
		return saldo;
	}

	public double ambilTabungan(double in) {
		saldo -= in;
		System.out.println(in + " ambil tabungan");
		return saldo;
	}
}
