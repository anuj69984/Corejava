package assignment_06;
/**
 * @author anuj6
 * 
 * Write a program which takes arguments of type tel:XXXXXXXXXX where X is any number from command line and
 then parse number from that string.
 */

import java.util.Scanner;
public class Parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1= new Scanner(System.in);
		System.out.println("Enter your phone no : ");
		String s =scan1.nextLine();
		long i=Long.parseLong(s);
		System.out.println("Your no is : ");
		System.out.println(i);

	}
}
