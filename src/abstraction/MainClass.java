package abstraction;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	sc.close();
	AbstractClass ab=new InheritedClass();
	ab.add(a, b);
	ab.subract(a, b);

	}

}
