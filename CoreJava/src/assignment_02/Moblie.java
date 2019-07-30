package assignment_02;

/**
 * @author Anuj kumar
 *
 *Demonstrate method overriding
-- Create a class Mobile having variables manufacturer, operating_system, model, cost and method getModel() to access Model property of Object with constructor to set properties/characteristics of object
--Create a class Android that extends Mobile and override getModel () method with Constructor to set properties/characteristics of object
-- Create a class Blackberry that extends Mobile and override getModel () method with Constructor to set properties/characteristics of object
-- Create a class Apple that extends Mobile and override getModel () method with Constructor to set properties/characteristics of object
-- Create a class MobileDemo and call get Model method of all the classes by Creating Object of SuperClass.
 */


class Mobile {
	String manufacturer,operating_system;
	int model,cost;
	
	
	public void getModel() {
		manufacturer="Microsoft";
		operating_system="Windows 10";
		model=2019;
		cost= 50000;
		System.out.println("manufacturer:" + manufacturer +
				" operating_system:" + operating_system + 
				" model:" + model + " cost:" + cost);
	}
}

class Android extends Mobile {
	public void getModel() {
		manufacturer="Google";
		operating_system="Android";
		model=2018;
		cost= 55000;
		
		System.out.println("manufacturer:" + manufacturer +
				" operating_system:" + operating_system + 
				" model:" + model + " cost:" + cost);
	}
}
class Blackberry extends Mobile {
	public void getModel() {
		manufacturer="Blackberry";
		operating_system="ops";
		model=2016;
		cost= 45000;
		
		System.out.println("manufacturer:" + manufacturer +
				" operating_system:" + operating_system + 
				" model:" + model + " cost:" + cost);
	}
}

class Apple extends Mobile {
	public void getModel() {
		manufacturer="Apple";
		operating_system="iOS";
		model=2020;
		cost= 80000;
		
		System.out.println("manufacturer:" + manufacturer +
				" operating_system:" + operating_system + 
				" model:" + model + " cost:" + cost);
	}
}

class MobileDemo {
	public static void main(String[] args) {
		Mobile obj1= new Mobile();
		obj1.getModel();
		
		Android obj2= new Android();
		obj2.getModel();
		
		Blackberry obj3= new Blackberry();
		obj3.getModel();
		
		Apple obj4= new Apple();
		obj4.getModel();
				
	}
}