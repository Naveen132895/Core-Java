/*This is a basic example for class and object
 */

package classnobject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassAndObjectExample {
	private static int roll=10; // instance variables
	private static int a=5; // class variable
	protected int b =10;
	public int c=15;
	int d = 20;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int roll=5;
	//	String name; // variables that are inside the method are called as local
		/*double cgpa;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		roll=Integer.parseInt(br.readLine());
		name=br.readLine();
		cgpa=Double.parseDouble(br.readLine());
		StudentClass student=new StudentClass(roll,name,cgpa);
		student.display();*/
	//	ClassAndObjectExample c=new ClassAndObjectExample();
		ClassAndObjectExample.display();
	//	System.out.println(c.roll);
		System.out.println(roll);
	}
public static void display() {
	System.out.println(roll);
}
}
