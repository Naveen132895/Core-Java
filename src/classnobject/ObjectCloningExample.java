package classnobject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectCloningExample implements Cloneable {

	public static void main(String[] args) throws NumberFormatException, IOException, CloneNotSupportedException {
		int roll;
		String name;
		double cgpa;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		roll=Integer.parseInt(br.readLine());
		name=br.readLine();
		cgpa=Double.parseDouble(br.readLine());
		StudentClass student1=new StudentClass(roll,name,cgpa);
		StudentClass student2=(StudentClass) student1.clone();
		StudentClass student3=new StudentClass(1,"venkat",3.0);
 		student1.display();
		student2.display();
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1.getClass());
		System.out.println(student2.getClass());
		System.out.println(student1.name.equals(student3.name));
		System.out.println(student1.equals(student3));
		System.out.println(student1.name==student3.name);
		System.out.println(student2==student1);
		
	}
	

}
