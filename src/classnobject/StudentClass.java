package classnobject;

public class StudentClass implements Cloneable {
	int roll;
	String name;
	double cgpa;
	public StudentClass(int roll,String name,double cgpa) {
		this.roll=roll;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	public void display() {
		System.out.println("The student details are");
		System.out.println("Roll Number "+this.roll);
		System.out.println("Name "+this.name);
		System.out.println("CGPA "+this.cgpa);
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		} 
}
