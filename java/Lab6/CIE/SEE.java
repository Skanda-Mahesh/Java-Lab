import Personal.Personal;


import java.util.Scanner;

class External extends Personal {
	int Marks[] = new int[5];

	public void getd() {
		Scanner sx = new Scanner(System.in);
		for (int i = 0; i<5; i++) {
			Marks[i] = sx.nextInt();
	}

	}
	public void setd() {

		for (int i = 0; i<5; i++) {
			System.out.println(Marks[i]);
			}
	}

	}
