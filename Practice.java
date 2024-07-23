package Switch_Case_Concept;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  value of a");
		int a = sc.nextInt();
		System.out.println("Enter the  value of b");
		int b = sc.nextInt();
		System.out.println("Enter the  value of case");
		int c = sc.nextInt();

		switch (c) {

		case 1:
			double sum = a + b;
			System.out.println(sum);
			break;
		case 2:
			double sub = a - b;
			System.out.println(sub);
			break;

		case 3:
			double mul = a * b;
			System.out.println(mul);
			break;

		default:
			double div = a / b;
			System.out.println(div);

		}

	}

}
