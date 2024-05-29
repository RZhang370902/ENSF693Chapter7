// A simple class hierarchy.

// A class for two-dimensional objects.
class TwoDShape {
	
	//private will cause error in subclass
	private double width;
	private double height;
	
	// Parameterized constructor
	TwoDShape(double w, double h) {
		width =w;
		height = h;
	}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	// Accessor methods for width and height
	double getWidth() { return width; }
	double getHeight() { return height;}
	void setWidth(double w) { width = w; }
	void setHeight (double h) { height = h; }
	
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
	String style;
	
	// Constructor
	Triangle(String s, double w, double h) {
		
		/*
		setWidth(w);
		setHeight(h);
		*/
		
		super(w, h);
		
		style = s;
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}


// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
	
	Rectangle (double w, double h) {
		super(w ,h);
		
	}
	
	boolean isSqaure() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}


public class Shapes {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("filled", 4.0, 4.0);
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);
		/*
		t1.setWidth(4.0);;
		t1.setHeight(4.0);
		t1.style = "filled";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "outlined";
		*/
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
		TwoDShape shape = new TwoDShape(10, 20);
		
		shape.setWidth(10);
		shape.setHeight(20);
		
		shape.showDim();
		
		
		
		
		
	}

}
