// A multilevel hierarchy.
class TwoDShape2 {
	private double width;
	private double height;
	
	// A default constructor.
	TwoDShape2() {
		width = height = 0.0;
	}
	
	// Parameterized constructor.
	TwoDShape2(double w, double h) {
		width = w;
		height = h;
	}
	
	// Construct object with equal width and height.
	TwoDShape2(double x) {
		width = height = x;
	}
	
	// Accessor methods for width and height.
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) {width = w; }
	void setHeight(double h) { height = h; }
	
	void showDim() {
		System.out.println("Width and height are " + width + " and" + height);
		
	}
	
}

// Extend TwoDShape2.
class Triangle2 extends TwoDShape2 {
	private String style;
	
	// A default constructor.
	Triangle2() {
		super();
		style = "none";
	}
	
	Triangle2(String s, double w, double h) {
		super(w, h); // call superclass constructor
		
		style = s;
	}
	
	// One argument constructor.
	Triangle2(double x) {
		super(x); // call superclass constructor
		
		style = "filled";
		
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
	
}

// Extend Triangle2.

class ColorTriangle2 extends Triangle2 {
	private String color;
	
	ColorTriangle2(String c, String s, double w, double h) {
		
		super(s, w , h);
		
		color = c;
	}
	
	String getColor() { return color;}
	
	void showColor() {
		System.out.println("Color is " + color);
	}
	
}


public class Shapes6 {
	public static void main(String[] args) {
		ColorTriangle2 t1 = new ColorTriangle2("Blue", "outlined", 8.0, 12.0);
		ColorTriangle2 t2 = new ColorTriangle2("Red", "filled", 2.0, 2.0);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Area is " + t2.area());
		

		
		
	}
	
}
