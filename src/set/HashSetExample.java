package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

import arraylistexample.Employee;

public class HashSetExample {
	public static void main(String[] args) {
		   int n,i,value;
	       String name;
	       int age;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	      HashSet<Employee> hashset = new HashSet<Employee>();
	       Employee[] emp=new Employee[n];
	       for(i=0;i<n;i++)
	       {
	    	   name=sc.next();
	    	   age=sc.nextInt();
	    	   emp[i]=new Employee();
	    	   emp[i].setAge(age);
	    	   emp[i].setName(name);
	    	   hashset.add(emp[i]);
	       }
	
	     /*   Iterator<Employee> itr = hashset.iterator();
	        while(itr.hasNext()){
	        	Employee e = (Employee)itr.next();
	            System.out.println(e.getName()+e.getAge());
	        }*/
	       for(Employee e:hashset)
	    	   System.out.println(e.getName()+e.getAge());
	       sc.close();
	}
}
