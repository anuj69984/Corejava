package assignment_05;

/**
 * 
 * @author anuj6
 *
 *Write an abstract base class Logger having one abstract method writeLog()
 Create a class Info that extends Logger class & override writeLog method that prints ‘Info!’
 Create a class Warn that extends Logger class & override writeLog method that prints ‘Warn!’ it also
has one more method writeLog(Warn another) that prints ‘Warning!’
 Create a class Debug that extends Warn class & override writeLog () method that prints ‘Debug!’ and
writeLog (Warn another) method that prints ‘Warning Debug!’
 Now create a class TestLogger having main method & demonstrate the use of subclass, polymorphisms
& downcasting to print the following output
**** Using the subclasses ******
Info!
Warn!
Debug!
**** Using Polymorphism ******
Info!
Warn!
Debug!
**** Downcasting ******
Warning!
Warning Debug!
Warning!
Warning Debug!
Warning Debug!
 */

public abstract class Logger {
	
	public abstract void writeLog();

	

}

class Info extends Logger {
	public void writeLog() {
		System.out.println("Info!");
	}
}

class Warn extends Logger{
	public void writeLog() {
		System.out.println("Warn!");
	}
	public void writeLog(Warn another) {
		System.out.println("Warning!");
	}
}

class Debug extends Warn{
	public void writeLog() {
		System.out.println("Debug!");
	}
	public void writeLog(Warn another) {
		System.out.println("Warning Debug!");
	}
}

class TestLogger{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger obj1= new Debug();
		Logger obj= new Info();
		Logger obj2=new Warn();
		System.out.println("***********using subclass********");
		obj.writeLog();
		obj2.writeLog();
		obj1.writeLog();
		
		
		System.out.println("***********using Polymorphism********");
		Debug obj3= new Debug();
		Info obj4= new Info();
		Warn obj5=new Warn();		
		obj4.writeLog();
		obj5.writeLog();
		obj3.writeLog();
		
	
	}
}