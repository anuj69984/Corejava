package assignment_14;
import java.io.*;
import java.util.*;

/**
 * 
 * @author anuj6
 *
 *Write an example
 That counts the number of times a particular character, such as e, appears in a file. The character
can be specified at the command line.
 That counts the number of times a particular word, such as “abc”, appears in a file. The word should
be taken as input from console. You can use xyz.txt as the input file and path of the file should be
taken as input from console
 */

public class Charcounter {
     
                public static void main(String[] args) throws Exception
                {
                                String path = "C:\\\\Users\\\\anuj2.kumar\\\\Desktop\\\\Java training\\\\Data.txt";//text document path
                                File name =new File(path);
                                Scanner s=new Scanner(System.in);
                                System.out.println("Check the count of char : ");
                                char c=s.next().charAt(0);
                                FileInputStream fis=new FileInputStream(name);
                                int a=fis.read();
                                int count=0;
                                while(a!=-1)
                                {
                                                if(a==(int)c)
                                                {
                                                                count++;
                                                }
                                                a=fis.read();
                                }
                                System.out.println("Count of char "+c+" is: "+count);
                                fis.close();
                                
}
}

