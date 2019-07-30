package assignment_10;

/**
 * 
 * @author anuj6
 *
 *Go through wrapper classes – especially Integer, Float and have a quick look of available methods (APIs).
Please make a note of properties of wrapper classes and association of different primitive data types and its
wrapper classes and perform following assignments
Create a class WrapperIntro having main method
 Take following wrapper objects
Integer intObj1 = new Integer (25);
Integer intObj2 = new Integer ("25");
Integer intObj3= new Integer (35);
Float f1 = new Float ("2.25f");
Float f2 = new Float ("20.43f");
Float f3 = new Float (2.25f);
Now perform
Comparing using compareTo Obj1 and Obj2
Comparing using compareTo Obj1 and Obj3
Comparing using equals Obj1 and Obj2
Comparing using equals Obj1 and Obj3
Comparing using compare f1 and f2
Comparing using compare f1 and f3
Addition of intObj1 and f1
 Take following wrapper objects
Integer intWrapper = Integer.valueOf ("12345");
//Converting from binary to decimal
Integer intWrapper2 = Integer.valueOf ("11011", 2);
//Converting from hexadecimal to decimal
Integer intWrapper3 = Integer.valueOf ("D", 16);
Now print
Value of intWrapper Object
Value of intWrapper2 Object:
Value of intWrapper3 Object
Hex value of intWrapper
Binary Value of intWrapper2
 */
public class WrapperIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer intObj1 = new Integer (25);
		Integer intObj2 = new Integer ("25"); 
		Integer intObj3= new Integer (35); 
		Float f1 = new Float ("2.25f");   
		Float f2 = new Float ("20.43f");   
		Float f3 = new Float (2.25f); 
		
		//intObj1.compareTo(intObj2);
		System.out.println(intObj2); //25
		System.out.println(intObj1.compareTo(intObj2)); //0
		System.out.println(intObj1.compareTo(intObj3)); //-1
		System.out.println(intObj1.equals(intObj2)); //true
		System.out.println(intObj1.equals(intObj3)); //false
		System.out.println(Float.compare(f1,f2)); //-1
		System.out.println(Float.compare(f1,f3)); //0
		Float f5=intObj1+f1;
		System.out.println(f5);// 27.25
		
		//System.out.println("****************");
		Integer intWrapper = Integer.valueOf ("12345");    
		Integer intWrapper2 = Integer.valueOf ("11011", 2);  //Converting from binary to decimal  
		Integer intWrapper3 = Integer.valueOf ("D", 16); //Converting from hexadecimal to decimal 
		
		System.out.println(intWrapper);
		System.out.println(intWrapper2);
		System.out.println(intWrapper3);
		System.out.println(Integer.toHexString(intWrapper));
		//.toString(intWrapper2);
		System.out.println(Integer.toBinaryString(intWrapper2));
	}

}
