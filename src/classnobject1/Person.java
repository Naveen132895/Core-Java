package classnobject1;
public class Person {
	private String firstname;
	private String lastname;
	private int age;
	//constructor is used to initialze 
	//an initial value to an object
public Person() {

	}


public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


void display()
	{
		System.out.println("First Name:"
				+this.getFirstname()
	+"\nLast Name"+this.getLastname());
	}
	
}
