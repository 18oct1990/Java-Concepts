package Java;

import java.util.Scanner;

public class InputFromUser {
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		System.out.println("What is your name");
		String name=sc.nextLine();
		System.out.println("Enter first number");
		int Input1=sc.nextInt();
		System.out.println("Enter Second number");
		int Input2=sc.nextInt();
		int output=Input1 +Input2;
		System.out.println("User's name "+name);
		System.out.println("Total is "+output);
		
		
	}
		
}

