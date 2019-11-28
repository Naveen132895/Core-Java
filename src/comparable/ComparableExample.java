package comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import treeset.Employee;

/*
 * can be sorted only using single data member only
 * interface is found in java.lang package 
 * contains only one method named compareTo(Object)
 */
public class ComparableExample {
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
	Collections.sort(list);
	     /*   Iterator<Employee> itr = hashset.iterator();
	        while(itr.hasNext()){
	        	Employee e = (Employee)itr.next();
	            System.out.println(e.getName()+e.getAge());
	        }*/
	       for(Employee e:list)
	    	   System.out.println(e.getName()+e.getAge());
	       sc.close();
	}
}
