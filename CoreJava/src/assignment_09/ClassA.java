package assignment_09;

/**
 *
 * @author anuj6
 *
 *WAP to demonstrate type casting / conversion of different primitive data types and of hierarchy of classes (class
cast). Please take your own example for the same. For class casting, here is one such scenario: Suppose
there are three classes – A, B and C. B is subclass of A and C is of B. Class A has no data members and no
member function. B has one integer data member while C has two data members. Demonstrate class casting
for this situation and print the integer values.
 */

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA x=new ClassB();
		ClassB y=(ClassB)x;
		ClassB z=new ClassC();
		ClassC w=(ClassC)z;
        System.out.println("Int of classB-"+y.a);
        System.out.println("String of classC-"+w.str1);
        System.out.println("String of classC-"+w.str);

		

	}

}

class ClassB extends ClassA{
    int a=10;
}
class ClassC extends ClassB{
    String str1="Jio";
    String str="Anuj";
}