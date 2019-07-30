package assignment_13;

/**
 * @author anuj6
 * 
 * Go through the documentation of I/O streams and File I/O.
 Demonstrate with suitable example the use of File, FileInputStream , FileOutputStream classes APIs
 Find the possible ways of taking input at run time in java program and demonstrate through java
code.
 Create a file Data.txt having some content , now print the content of the file
 Take more content at runtime and write it into file
 */

import java.util.Scanner;
import java.io.*;

public class IoStream {
           public static void main(String[] args) throws Exception {
              File name=new File("Data.txt"); // file name 
              FileOutputStream fos=new FileOutputStream(name); 
              DataOutputStream dos=new DataOutputStream(fos);
              dos.writeUTF("hello"); // writing text in the file
              dos.close();
              FileInputStream fis=new FileInputStream(name);
              DataInputStream dis=new DataInputStream(fis);
              String s=dis.readUTF(); // reading the text from the file
              System.out.println(s);

              File file=new File("C:\\Users\\anuj2.kumar\\eclipse-workspace\\My_Project\\Data.txt");//file path
              FileWriter fw=new FileWriter(file, true);// 'true' to append the text in the file or it will overwrite the existing text
              fw.write(" ");
              Scanner q=new Scanner(System.in);
              String b=q.nextLine();
              fw.write(b);
              fw.close();
            }
}
