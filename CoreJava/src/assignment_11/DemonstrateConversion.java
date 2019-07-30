package assignment_11;
/**
 * 
 * @author anuj6
 *
 *Go through String and Object class and have a look of provided APIs
  Demonstrate conversion between byte array, String and then to char array through java code. E.g.
start with byte array {104,101,108,108,111,104,101,108,108,111,104,101,108}.
  List the non- final methods of Object class. Now override two methods – hashCode() and equals()
in your class and demonstrate proper use of these overrides through code. Also show the equivalence
relation for set of different objects. Take your own example of class, instance variable etc.
 */

public class DemonstrateConversion {

	public static void main(String[] argv) {
		//conversion of byte array into string	    	    
	    byte[] bytearray2= {104,101,108,108,111,104,101,108,108,111,104,101,108};
	    System.out.print("Original byte array : ");
	    for(byte b : bytearray2) {
	    	System.out.print(b + " ");
	    }
	    System.out.println();

	    String str1 = new String(bytearray2);
	    System.out.println("String Decryted : " + str1);
	    int i=str1.length();
	    
	    //conversion of string to char array
	    System.out.print("Character array : ");
	    char chararray[]=str1.toCharArray();
	    for(char x : chararray) {
	    	System.out.print(x + " ");
	    }
	    System.out.println("\n----------------------");
	    
	    // conversion from string to byte
	    String str = "Anuj kumar";
	    byte[] bytearray = str.getBytes();
	    System.out.println("String : " + str);
	    System.out.println("String in Byte : " + bytearray);
	    System.out.println("String in Byte : " + bytearray.toString());
	    

}
}