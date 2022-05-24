package nexsoft.day3_looping;

import java.util.Scanner;

public class SampleLooping12_LoginLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String uname, pass;
		String dbUname[] = {"ridho","dori","dodo"};
		String dbPass[] = {"1","2","3"};
		
		System.out.println("LOGIN");
		System.out.print("Username : ");
		uname = sc.nextLine();
		System.out.print("Password : ");
		pass = sc.nextLine();
		System.out.println("");
		
		for(int i=0;i<dbUname.length;i++) {
			if(uname.equalsIgnoreCase(dbUname[i])) {
				for(int j=0;j<dbPass.length;j++) {
					if(pass.equalsIgnoreCase(dbPass[j])) {
						System.out.println("Cocok! User:"+uname);
						break;
					}else {
						System.out.println("Nama dan password salah!");
						break;
					}
				}
				break;
			}else {
				System.out.println("Nama salah!");
			}
			
		}
		
	}

}
