package start;

import java.util.Scanner;

import page.tests.HumanityAddEmployee;
import page.tests.HumanityLogin;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int izbor;
		do {
			System.out.println();
			System.out.println("***Welcome to humanity.com***");
			System.out.println();
			System.out.println("Please choose feature you wan to test: ");
			System.out.println("1 - Login");
			System.out.println("2 - Add New Employee");
			System.out.println("0 - Exit");
			System.out.print("Insert the number: ");

			izbor = sc.nextInt();
			sc.nextLine();
			switch (izbor) {
			case 0:
				System.out.println("Goodbye, have a nice day");
				break;
			case 1:
				if (HumanityLogin.testLogin()) {
					System.out.println("Test passed");
				} else {
					System.out.println("Test not passed");
				}
				break;
			case 2:
				if (HumanityAddEmployee.testAddEmployee()) {
					System.out.println("Test passed");
				} else {
					System.out.println("Test not passed");
				}
				break;
			default:
				System.out.println("Wrong input");
				Thread.sleep(1000);
				System.out.print("* * * * * * * *");
				System.out.println();
				break;
			}
		} while (izbor != 0);
	}
}
