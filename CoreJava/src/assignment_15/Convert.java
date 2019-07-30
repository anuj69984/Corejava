package assignment_15;

/**
 * 
 * @author anuj6
 *
 *Do some demonstration through java code for conversion between say (int, binary, octal etc.)
 Also convert hexadecimal string say (B0) to binary (of 8 - bit). Now inspect the bit values:
Following are the meaningful bit values and associated output:
A1: 0 - > + otherwise null or empty string B1B2B3:000 -> ns
A2 :0 -> tel: otherwise sip: B1B2B3:001 -> smsc
B1B2B3:100 -> ipsmgw C1: 0 -> @ otherwise invalid input
D1D2:00 -> mum.rancoretech.com D1D2:01 -> del.rancoretech.com
Multi-bit values other than above will be considered as invalid. Print the generated string as a whole.
 Convert char(hexadecimal) to ASCII. e.g. find the ASCII value of ‘A’.
 Convert decimal to ASCII. e.g. find the ASCII value of 65.
 Convert binary string (say 11110000) to decimal and then to hexadecimal.
 */

public class Convert {

	  public static void main(String[] args) {
	    char c = 'A';
	    System.out.println((int) c);

	    int i = 65;
	    System.out.println((char) i);
	    
	    String binary = "11110000";
	    System.out.println(Integer.valueOf(binary, 2));
	  }

	}