package innerclass;
	abstract class Person{  
		  abstract void learn();  
		}  
		class JavaAnonymousInnerClassExample{  
		 public static void main(String args[]){  
			 Person p=new Person(){  
			 void learn(){
				 System.out.println("Welcome to FACE");}
	  };  
	  p.learn();  
	 }  
	}  