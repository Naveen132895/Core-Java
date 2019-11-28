package constructor;

public class Shape {
	
	private int length;
	private int breadth;
	private int height;
	private int radius;
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Shape() {};
	public Shape(int length, int breadth, int height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public Shape(int radius) {
		this.radius=radius;
	}
	public Shape(int height,int radius) {
		this.height=height;
		this.radius=radius;
	}

	public float calculateAreaOfCube() {
		
		return (float)this.getLength()*(float)this.getBreadth()*(float)this.getHeight();
	}
public float calculateAreaOfSphere() {
		
		return 4*((float)22/(float)7*(float)(Math.pow(this.getRadius(), 2)));
	}
public float calculateAreaOfCylinder() {
	
	return 2*(float)22/(float)7*(float)this.getRadius()*(float)this.getHeight();
}
}
