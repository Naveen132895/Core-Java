package encapsulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		int roll;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		roll=sc.nextInt();
		
EncapsulatedClass encap=new EncapsulatedClass();
		encap.setName(name);
		encap.setRoll(roll);
		encap.display();
	}

}
