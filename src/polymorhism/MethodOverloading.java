package polymorhism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import inheritance.Child;

public class MethodOverloading extends MethodOVerriding{
public static void main(String[] args) throws NumberFormatException, IOException {
		int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
MethodOVerriding moverload=new MethodOverloading();
	c=moverload.add(a, b);
	int d=moverload.add(a,b,c);
	float e=moverload.add(a,b,d);
	System.out.println(e);
	}
//example for overloading
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public float add(int a,int b,float d) {
		return super.add(a, b, d);
	}
}
