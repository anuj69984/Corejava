package assignment_08;

/**
 * @author anuj6
 * 
 * Parse the following String format to only print the IP address. There is a double whitespace after each colon (:)
	[IP-Address]: [ipv4]: [10.124.25.210]
 */

import java.util.Scanner;
public class ParsingIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the ip address [IP-Address]: [ipv4]: [10.124.25.210]");
		Scanner scan1=new Scanner(System.in);
		String str1=scan1.nextLine();
		
		//String str="[IP-Address]: [ipv4]: [10.124.25.210]";
		System.out.println("Length of string is : " + str1.length());
		String sub=str1.substring(str1.length()-14, 36);
		System.out.println(sub);
	}

}
