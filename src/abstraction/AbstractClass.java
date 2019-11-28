package abstraction;

abstract class AbstractClass {
// abstraction is to hide internal
//working
//uses abstract keyword
// can have abstract methods and non abstract methods
public abstract void add(int a,int b);
//used to create standardization between known
//entities
//abstract class cannot be instantiated

public void subract(int a,int b)
{
	System.out.println(a-b);
}
}
