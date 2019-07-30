package assignment_07;

/**
 * @author anuj6
 * 
 * Write a program which takes input as of type sip:displayname<username@domain.com> from console like
	sip:sdp<sdp@rjil.com> Then extract displayname, username@domain.com and print values.
 */

import java.util.Scanner;
public class DiplayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input format : sip:sdp<sdp@rjil.com>");
		Scanner scan1=new Scanner(System.in);
		String str=scan1.nextLine();
		//String str1="sip:sdp<sdp@rjil.com>";
		int pos1=str.indexOf("<");
		int pos2=str.indexOf(">");
		String sub=str.substring(4,pos1);
		String sub2=str.substring(pos1+1, pos2);
		System.out.println("Display name : " + sub);
		System.out.println("User name : " + sub2);

	}

}
