import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        int a, b, c;
  
        
        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter the value of a: ");
        a = sn.nextInt();
        System.out.println("Please enter the value of b: ");
        b = sn.nextInt();
        System.out.println("Please enter the value of c: ");
        c = sn.nextInt();
        sn.close();
    
		Quadratic quad = new Quadratic(a, b, c);
		quad.return_roots();
    
    }
}

class Quadratic {
	int a, b, c;
	Quadratic(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	
	void return_roots() {
		
		double disc = Math.pow(b, 2) - (4 * a * c);

		if (disc < 0) {
			double r1, r2;
			r1 = ((-1 * b)  / (2 * a));
			r2 = ((-1 * b)  / (2 * a));
			System.out.println("Discriminant is less than zero, immaginarry roots");

			System.out.println("Root one: " + r1 + "+" + Math.sqrt(Math.abs(disc) / (2*a)) + "i" );
			System.out.println("Root Two: " + r2 + "+" + Math.sqrt(Math.abs(disc) / (2*a)) + "i" );
		}
		
		else if(disc == 0) {
			double r1;
			r1 = (-1 * b) / 2*a;
			System.out.println("One real root: " + r1);
		}

		else {
			double r1, r2;
			r1 = ((-1 * b) + Math.sqrt(disc) / (2 * a));
			r2 = ((-1 * b) - Math.sqrt(disc) / (2*a));
			System.out.println("Root one: " + r1);
			System.out.println("Root Two: " + r2);
		}
	}
}













	



