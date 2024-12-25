import java.util.Scanner;

abstract class Shape {
	double dim1;
	double dim2;

	abstract double printArea ();
}


class Rectangle extends Shape {
	Rectangle(double length, double width) {
		dim1 = length;
		dim2 = width;
	}

	double printArea () {
		return (dim1 * dim2);
	}

}

class Triangle extends Shape {
	Triangle(double length, double width) {
		dim1 = length;
		dim2 = width;
	}

	double printArea () {
		return ( 0.5 * dim1 * dim2);
	}
}

class Circle extends Shape {
	Circle(double radius) {
		dim1 = radius;
		dim2 = 0;
	}

	double printArea() {
		return (Math.PI * dim1);
	}

}


class Main {
	public static void main(String args[]) {
		Scanner sx = new Scanner(System.in);
		int input = 0;

		while (true) {
			System.out.println("Enter 1 for Rectangle | 2 for Triangle | 3 for Circle | CTRL+C for exit ");
			input = sx.nextInt();
			int inp1, inp2;
			System.out.println("Enter inputs: ");
			switch (input) {

				case (1): 
					inp1 = sx.nextInt();
					inp2 = sx.nextInt();
					Rectangle R1 = new Rectangle(inp1, inp2);
					System.out.println("Rectangle: " + R1.printArea());
					break;

				
				case (2):
					inp1 = sx.nextInt();
					inp2 = sx.nextInt();
					Triangle T1 = new Triangle(inp1, inp2);

					System.out.println("Triangle: " + T1.printArea());
				case (3):
					inp1 = sx.nextInt();
					inp2 = sx.nextInt();
					Circle C1 = new Circle(inp1);

					System.out.println("Circle: " + C1.printArea());
				
					

					

	
	}

	}}}