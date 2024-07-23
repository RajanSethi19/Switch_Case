package Switch_Case_Concept;

import java.util.Scanner;

public class Swtch_Case_Calculator_Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("Enter the case you want to run either 1,2,3 or 4 select any one");
		int c = sc.nextInt();

		switch (c) {

		case 1:
			double mul = a * b;
			System.out.println(mul);
			break;
		case 2:
			double sub = a - b;
			System.out.println(sub);
			break;
		case 3:
			double add = a + b;
			System.out.println(add);
			break;
		default:
			double div = a / b;
			System.out.println(div);
		}

	}

}
