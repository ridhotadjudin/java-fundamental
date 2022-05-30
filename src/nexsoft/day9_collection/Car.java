package nexsoft.day9_collection;

public class Car {
	
	private String name, type;
	private int maxSpeed;
	
	public Car(String name, String type, int maxSpeed) {
		super();
		this.name = name;
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.printf("Nama: %s, Tipe: %s, Max Speed: %d\n",name,type,maxSpeed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
