package comparator;

import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 *  interface is found in java.util package 
 *  contains 2 methods compare(Object obj1,Object obj2) 
 *  and equals(Object element).
 *  It provides multiple sorting sequence 
 *  you can sort the elements on the basis of any 
 *  data member
 *  example rollno, name, age or anything else.
 */
public class ComparatorExample {

	public static void main(String[] args) {
		   int n,i;
	       String name;
	       int age;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	       List<Employee> list = new LinkedList<Employee>();
	       Employee[] emp=new Employee[n];
	       for(i=0;i<n;i++)
	       {
	    	   name=sc.next();
	    	   age=sc.nextInt();
	    	   emp[i]=new Employee();
	    	   emp[i].setAge(age);
	    	   emp[i].setName(name);
	    	   list.add(emp[i]);
	       }
	       System.out.println("Name wise comparison");
	Collections.sort(list,new NameComparator());
	for(Employee e:list)
 	   System.out.println(e.getName()+e.getAge());
	    
	System.out.println("Age wise comparison");
	Collections.sort(list,new AgeComparator());
	       for(Employee e:list)
	    	   System.out.println(e.getName()+e.getAge());
	       sc.close();
	}
}
