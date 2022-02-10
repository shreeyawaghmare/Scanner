package scanner;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("Enter your name: ");

String name = input.nextLine();

System.out.println("My name is " + name);

input.close();
	}

}
