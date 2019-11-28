package accessspecifiers;

import MethodOverriding.Main;

public class AccessModifiers extends Child{

	public static void main(String[] args) {
			
		Child ch=new Child();
		System.out.println();
		//System.out.println(ch.a);
		System.out.println(ch.b);
		System.out.println(ch.c);
		System.out.println(ch.d);
	}

}
