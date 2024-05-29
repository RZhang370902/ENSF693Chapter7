// Method overriding. Method in subclass overrides method in superclass.
class A {
	int i, j;
	A(int a, int b) {
		j = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}	
}

class B extends A {
	int k;
	
	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// display k - this overrides show() in A
	void show(int a, int b, int c) {
		super.show();
		System.out.println("k: " + k);
	}
	
	// overload show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}


public class Override {
	public static void main(String[] args) {
		B subOb = new B(1, 2, 3);
		
		subOb.show("This is k: "); // this calls show() in B
		subOb.show();
	}

}
