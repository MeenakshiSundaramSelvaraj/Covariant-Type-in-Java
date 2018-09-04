
class A {
}

class B extends A {
}

class Shape {
	public A draw() {
		return new A();
	};
}

class Circle extends Shape {
	public B draw() {
		return new B();
	};
}

public class Covariant {
	public static void main(String args[]) {
		Shape shape = new Shape();
		shape.draw();

		Circle circle = new Circle();
		circle.draw();
	}

}
