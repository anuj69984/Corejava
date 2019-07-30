package assignment_04;

/**
 * @author anuj6
 */
import java.util.Scanner;

public interface Employees {
	String name="Anuj";
	String dateOfbirth="";
	String department="SDE";
	
	int calculateAge();
	void printEmpDetail();
	
}

class demo implements Employees{

	Scanner scan1= new Scanner(System.in);
	String str=scan1.nextLine();
	
	String sub=str.substring(6);
	int i=Integer.parseInt(sub);
	int age;
	@Override
	public int calculateAge() {
		// TODO Auto-generated method stub
		age=2019-i;
		return (age);
		
	}

	@Override
	public void printEmpDetail() {
		// TODO Auto-generated method stub
//		System.out.println("Enter your name : ");
//		Scanner scan2=new Scanner(System.in);
//		String name2=scan2.nextLine();
		//name=(new StringBuilder()).append(name2).toString();
		

		
		System.out.println("Employee name : " + name);
		System.out.println("Age is : " + age);
		System.out.println("Department : " + department);
	}
}
