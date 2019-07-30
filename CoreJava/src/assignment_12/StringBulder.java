package assignment_12;

/**
 * @author anuj6
 * 
 * Demonstrate with suitable example the use of StringBuilder class. Suppose an object of StringBuilder class
contains a string say – “Delivery”. Now take inputs from console and generate & print “Service Delivery
Platform”.
 */

import java.util.*;

public class StringBulder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Delivery";
		StringBuilder sb=new StringBuilder();
		sb.append(" ");
		sb.append(str);		
		
		
		Scanner scan1=new Scanner(System.in);
		String str1=scan1.nextLine();
		sb.insert(0, str1);
		sb.append(" ");		
		Scanner scan2=new Scanner(System.in);
		String str2=scan2.nextLine();		
		sb.append(str2);
		
		System.out.println(sb);

	}

}
