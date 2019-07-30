package assignment_03;
/**
 * @author anuj6
 * 
 * Write an abstract base class MessageContext having one variable message_list of type arraylist along with two method
 *  printMessage () and saveMessage (String). And another class SIPMessageContext that extends this base class and override
 *   these methods printMessage prints all messages stored in arraylist message_list. SaveMessage (String) stores messages
 *    in message_list. And this class also uses thread that stores ten messages and in main thread as soon as 10 threads are
 *     stored in message_list then it will print all messages and application stops
 */

import java.util.Scanner;

abstract class MessageContext {
	String[] message_list=new String[10];
	
	public abstract void printMessage();
	public abstract void saveMessage(String str);

}

class SIPMessageContext extends MessageContext{
	public void printMessage() {
		for(String x : message_list) {
			System.out.print(x + " ");
		}
	}
	int j=0;
	//@Override
	public void saveMessage(String str) {
		// TODO Auto-generated method stub
		//StringBuilder sb=new StringBuilder();
		message_list[j]=str;
		j++;
	}
}

class demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageContext obj= new SIPMessageContext();
		
		Scanner scan2=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			String str2=scan2.nextLine();			
			obj.saveMessage(str2);
		}
		obj.printMessage();
	}
}
