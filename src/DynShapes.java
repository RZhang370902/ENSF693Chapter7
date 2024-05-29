// Use dynamic method dispatch.
// Change class to abstract
abstract class TwoDShape3 {
	
	//private will cause error in subclass
	private double width;
	private double height;
	private String name;
	
	// A default constructor.
	TwoDShape3() {
		width = height = 0.0;
		name = "none";
	}
	
	// Parameterized constructor
	TwoDShape3(double w, double h, String n) {
		width =w;
		height = h;
		name = n;
	}
	
	// Construct object with euqal width and height.
	TwoDShape3 (double x, String n) {
		width = height = x;
		name = n;
	}	
	
	// Construct an object from an object.
	TwoDShape3(TwoDShape3 ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	// Accessor methods for width and height
	double getWidth() { return width; }
	double getHeight() { return height;}
	void setWidth(double w) { width = w; }
	void setHeight (double h) { height = h; }
	
	String getName() { return name; }
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	// Now, area() is abstract.
	abstract double area(); // Make area() into an abstract method.
	
	/*
	double area() {
		System.out.println("area() must be overridden");
		return 0.0;
	}
	*/
	
	
}

// A subclass of TwoDShape for triangles.
class Triangle3 extends TwoDShape3 {
	String style;
	
	// A default constructor.
	Triangle3() {
		super();
		style = "none";
	}
	
	// Constructor for triangle.
	Triangle3(String s, double w, double h) {
		
		/*
		setWidth(w);
		setHeight(h);
		*/
		
		super(w, h, "triangle");
		
		style = s;
		
	}
	
	// One argument constructor.
	Triangle3(double x) {
		super(x, "triangle"); // call superclass constructor
		
		style = "filled";
	}
	
	// Construct an object from an object.
	Triangle3(Triangle3 ob) {
		super(ob); // pass object to TwoDShape constructor
		style = ob.style;
	}
	
	// Override area() for Triangle.
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}


// A subclass of TwoDShape for rectangles.
class Rectangle3 extends TwoDShape3 {
	// A default constructor.
	Rectangle3() {
		super();
	}
	
	// Constructor for Rectangle3.
	Rectangle3 (double w, double h) {
		super(w ,h, "rectangle"); // call superclass constructor
	}
	
	// Construct a square.
	Rectangle3(double x) {
		super(x, "rectangle"); // call superclass constructor
	}
	
	boolean isSqaure() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	//Override area() for Rectangle.
	double area() {
		return getWidth() * getHeight();
	}
	
}





public class DynShapes {
	public static void main(String[] args) {
		
		//a superclass reference can refer to a subclass object.
		TwoDShape3[] shapes = new TwoDShape3[4];
		
		shapes[0] = new Triangle3("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle3(10);
		shapes[2] = new Rectangle3(10, 4);
		shapes[3] = new Triangle3(7.0);
		//Create object of abstract class is not valid
		//however, abstract class can still be reference to a subclass object.
		//shapes[4] = new TwoDShape3(10, 20, "generic");
		
		for(int i =0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
	
	}
	
}
