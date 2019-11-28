package staticexp;

class StaticClassExample{  
int count=0;
//will get memory when instance is created  
// constructor is a method as that of 
//class name and is used to intialize initial
//value to an object
StaticClassExample(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
	StaticClassExample c1=new StaticClassExample();  
	StaticClassExample c2=new StaticClassExample();  
	StaticClassExample c3=new StaticClassExample();  
  
 }  
} 