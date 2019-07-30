package assignment_15;

/**
 * 
 * @author anuj6
 *
 */

public class HexBinary {

	  public static void main(String[] args) {
	    Integer hexInt = Integer.valueOf("44", 16);
//	    char c[] = Integer.toBinaryString(hexInt).toCharArray(); //missing 00 in front
	    String octalString = Integer.toOctalString(hexInt);
	    StringBuffer sb = new StringBuffer();
	    
	    char c[] = { '0', '0', '1', '0', '0', '1', '0', '0' };
	    
	    if (c[0] == '0') {
	      sb.append("+");
	    } else {
	      sb.append("null");
	    }

	    if (c[1] == '0') {
	      sb.append("tel:");
	    } else {
	      sb.append("sip:");
	    }

	    if (c[2] == '1' && c[3] == '0' && c[4] == '0') {
	      sb.append("ipsmgw");
	    } else if (c[2] == '0' && c[3] == '0' && c[4] == '0') {
	      sb.append("ns");
	    } else if (c[2] == '0' && c[3] == '0' && c[4] == '1') {
	      sb.append("smsc");
	    } else {
	      System.out.println("Error Format");
	      System.exit(0);
	    }

	    if (c[5] == '1') {
	      sb.append("@");

	    } else {
	      System.out.println("Error Format");
	      System.exit(0);
	    }

	    if (c[6] == '0' && c[7] == '0') {
	      sb.append("mum.rancoretech.com");

	    } else if (c[6] == '0' && c[7] == '1') {
	      sb.append("del.rancoretech.com");
	      sb.append("del.rancoretech.com");
	    } else {
	      System.out.println("Error Format");
	      System.exit(0);
	    }

	    System.out.println(sb); // output +tel:ipsmgw@mum.rancoretech.com
	  }// main

	}
