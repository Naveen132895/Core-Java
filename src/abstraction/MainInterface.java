package abstraction;

import java.util.Scanner;

public class MainInterface {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		InheritedInterface  inter=new InheritedInterface();
		inter.add(a, b);
		inter.sub(a, b);
		inter.mul(a, b);
		inter.div(a, b);

	}

}
