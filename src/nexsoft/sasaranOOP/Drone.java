package nexsoft.sasaranOOP;

public class Drone {
	
	private String tipeDrone;
	private String warna;
	private int speed;
	
	//constructor
	public Drone(String tipeDrone,String warna, int speed) {
		System.out.println("INI KONSTRUKTOR MANTAP");
		this.tipeDrone=tipeDrone;
		this.warna=warna;
		this.speed=speed;
	}
	
	public void cekKecepatan() {
		if(speed >500) {
			System.out.println("Drone jatuh");
		}else {
			System.out.println("Kecepatan masih batas aman");
		}
	}
	
	public void setTipeDrone(String tipeDrone) {
		this.tipeDrone = tipeDrone;
	}
	public String getTipeDrone() {
		return tipeDrone;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}
	public String getWarna() {
		return warna;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
}
