package constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws NumberFormatException, IOException {
		int length;
		int breadth;
		int height;
		int radius;
		int choice;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		choice=Integer.parseInt(br.readLine());
		System.out.println("1.Cube");
		System.out.println("2.Sphere");
		System.out.println("3.Cylinder");
		
		switch(choice) {
		case 1:
			length=Integer.parseInt(br.readLine());
			breadth=Integer.parseInt(br.readLine());
			height=Integer.parseInt(br.readLine());
			Shape cube=new Shape(length,breadth,height);
			System.out.println(cube.calculateAreaOfCube());
			break;
		case 2:
			radius=Integer.parseInt(br.readLine());
			Shape sphere=new Shape(radius);
			System.out.println(sphere.calculateAreaOfSphere());
			break;
		case 3:
			int ht=Integer.parseInt(br.readLine());
			int rad=Integer.parseInt(br.readLine());
			Shape cylinder=new Shape(ht,rad);
			System.out.println(cylinder.calculateAreaOfCylinder());
			break;
		}
		
	
		
		
		

	}

}
