package Internal;

import java.util.Scanner;
public class Internal {

	int[] Cources = new int[5];

	public void setd() {
		Scanner sx = new Scanner(System.in);
		System.out.println("Enter details of the 5 marks");

		for (int i = 0; i< 5; i++) {
			Cources[i] = sx.nextInt();
			}
	}	
	public void getd() {
		
		for (int i = 0; i< 5; i++) {
			System.out.println(Cources[i]);
			}
}		
}
