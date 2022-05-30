package nexsoft.day9_lambda;

public class Lambda1 {

	public static void main(String[] args) {
		
		int width = 10;
		Drawable d = new Drawable() {
			@Override
			public void draw(){
				System.out.println("Drawing "+width);
			}
		};
		d.draw();
		
		Drawable d2 = () -> {
			System.out.println("Drawing "+width);
		};
		d.draw();
		
		Addable ad1 = (a,b) -> (a+b);
		System.out.println(ad1.add(5,6));
		
		Addable ad2 = (a,b) -> (a+b);
		System.out.println(ad1.add(50,60));
 	}
	
}
