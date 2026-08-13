package dConstructor;

public class DRectangleClass {
	
	public double length;
	public double width;
	
	public DRectangleClass(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		double area = length*width;
		return area;
	}

	public static void main(String[] args) {
		
		DRectangleClass r1 = new DRectangleClass(10.6, 20);
		System.out.println("Area of rectangle is : "+ r1.calculateArea());
		
		DRectangleClass r2 = new DRectangleClass(5, 4);
		System.out.println("Area of rectangle is : "+ r2.calculateArea());

	}

}
