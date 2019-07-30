package assignment_14;

/**
 * @author anuj6
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class StringCounter {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String path = "C:\\Users\\anuj2.kumar\\Desktop\\Java training\\Data.txt";

     System.out.println("Check the count of String : ");
     String search = scanner.next();

     BufferedReader br = null; //creating an object with null 
     String line = null;
     int count = 0;
     try {
          br = new BufferedReader(new FileReader(path)); //memory allocating 
         line = br.readLine();
         while (line != null) {
         if (line.contains(search)) {
         int lastIndex = 0;
             while (lastIndex != -1) {
                 lastIndex = line.indexOf(search, lastIndex);
                 if (lastIndex != -1) {
                       count++;
                     lastIndex += search.length();
                 }
             }

         }
         line = br.readLine();
         }
         System.out.println("Count : " + count);
     } catch (Exception e) {
          System.out.println(e);;
     }

}
}

