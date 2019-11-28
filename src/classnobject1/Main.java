package classnobject1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
	String fname=null; //local variable
	String lname=null;
	int age;
	BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
	fname=br.readLine();
	lname=br.readLine();
	age=Integer.parseInt(br.readLine());
	// syntax for creating an object is
	// classname obj_name=new class_name() i.e constructor 
	Person person=new Person();//constructor 
person.setFirstname(fname);
person.setLastname(lname);
person.setAge(age);
person.display();
	fname=br.readLine();
	lname=br.readLine();
	age=Integer.parseInt(br.readLine());
	person.setFirstname(fname);
	person.setLastname(lname);
	person.setAge(age);
	person.display();
	
	}

}

