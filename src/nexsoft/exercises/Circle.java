package nexsoft.exercises;

public class Circle {
	private double jari;
	private String warna;
	
	public Circle() {
		jari = 1.0;
		warna = "biru";
	}
	public Circle(double newJari) {
		jari = newJari;
		warna = "biru";
	}
	public Circle(String newWarna) {
		jari = 1.0;
		warna = newWarna;
	}
	public Circle(double newJari,String newWarna) {
		jari = newJari;
		warna = newWarna;
	}
	
	public double getArea() {
		return jari*jari*Math.PI;
	}
	
	//jari
	public double getJari() {
		return jari;
	}
	public void setJari(double jari) {
		this.jari = jari;
	}
	
	//warna
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	
	public void print() {
		System.out.printf("Jari-jari %.2f, Luas %.2f, Warna %s\n",jari,getArea(),warna);
	}
	
	
}
