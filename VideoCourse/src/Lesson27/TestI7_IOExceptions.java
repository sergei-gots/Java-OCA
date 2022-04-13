 
package Lesson27;

import java.io.*;
 
public class TestI7_IOExceptions {
    
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        try {
            int counter = 0;
            File f = new File("test9.txt");
            
            System.out.println("File object was created.");
            FileInputStream fis = new FileInputStream(f);
            while(true) {
                counter++;
                result.append((char) (fis.read()));
                System.out.println("Info is being red");
            
                if (counter == 4){
                    //Next causes throwing the IOException during the next try
                    //reading.
                    fis.close();
                    System.out.println("Input stream was closed.");
                }
            }
            
        } catch (FileNotFoundException e){
            System.out.println("Exception 1"); 
            System.out.println("e = " + e);
            System.out.println("e.getMessage = \"" + e.getMessage() + "\"");
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Exception 2"); 
            System.out.println("e = " + e);
            System.out.println("e.getMessage = \"" + e.getMessage() + "\"");
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        } finally {
            System.out.println("This is finally.");
        }
        
        System.out.println("result = \"" + result + "\"");
        
    }
}
