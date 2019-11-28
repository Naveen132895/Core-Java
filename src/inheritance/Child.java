package inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//extends keyword is used 
//to extend the properties 
//and behaviors of the base class or parent class
//you can extend only one class in java
public class Child extends Parent{

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		Parent child=new Child();
		c=child.add(a, b);
		System.out.println(c);

	}
	/* add function return */
	public int add(int a,int b) {
		return 6 + super.add(a,b);
// super is a keyword which denotes the parent
	}

}
