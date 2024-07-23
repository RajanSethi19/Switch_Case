package Switch_Case_Concept;

import java.util.Scanner;

public class Switch_Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the case value");
		int a = sc.nextInt();

		switch (a) {

		case 1:
			System.out.println("I am in case 1");
			break;
		case 2:
			System.out.println("I am in case 2");
			break;
		case 3:
			System.out.println("I am in case 3");
			break;
		default:
			System.out.println("I am in default");
			

		}

	}

}
