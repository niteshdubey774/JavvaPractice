package com.javapractic.operation;

import java.util.Scanner;


public class UserOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);

		while (true) {

			System.out.print("Enter the choice - \n1. Add\n2. Sub\n3. Multiply\n4. Exit");
			int choice = scr.nextInt();

			Operations op = new Operations();

			int x, y;

			switch (choice) {

			case 1:
				System.out.println("Enter value of x=");
				x = scr.nextInt();

				System.out.println("Enter value of y=");
				y = scr.nextInt();

				System.out.println("The sum of two numbers is : " + op.add(x, y));
				break;

			case 2:
				System.out.println("Enter value of x=");
				x = scr.nextInt();

				System.out.println("Enter value of y=");
				y = scr.nextInt();

				System.out.println("The difference of two numbers is : " + op.sub(x, y));
				break;

			case 3:
				System.out.println("Enter value of x=");
				x = scr.nextInt();

				System.out.println("Enter value of y=");
				y = scr.nextInt();

				System.out.println("The product of two numbers is : " + op.multi(x, y));
				break;

			case 4:
				System.out.println("Exiting!");
				scr.close();
				//op.exit(0);
				System.exit(0);
				
			default:
				System.out.println("Please enter the valid choice!");
				break;
			}

		}

	}

}
