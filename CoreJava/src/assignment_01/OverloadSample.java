package assignment_01;

/**
 * @author Anuj kumar
 */
/*
Demonstrate method overloading
--Create a class OverloadSample having methods print(String s) , print (int i) print (String s, int i)
--Now create a class OverloadDemo having main method & perform execution of above methods

*/

public class OverloadSample {
	
	public void print(String s)
    {
         System.out.println(s);
    }
    public void print(int i)  
    {
         System.out.println(i);
    }
    public void print(String s, int i) {
    	System.out.println("String : " + s + "int : " + i);
    }
}

 class OverloadDemo {
	 public static void main(String[] args) {
	// TODO Auto-generated method stub
	{
	       OverloadSample obj = new OverloadSample();
	       obj.print("Anuj");
	       obj.print(10);
	       obj.print("Anuj ", 50);
	   }
	 }
}