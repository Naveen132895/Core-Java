package abstraction;

public class InheritedClass extends AbstractClass{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void subract(int a,int b)
	{
		super.subract(a, b);
	}
	
}
  