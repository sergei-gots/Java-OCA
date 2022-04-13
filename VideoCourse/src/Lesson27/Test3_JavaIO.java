 
package Lesson27;

import java.io.*;
/*
    Object -> 
        Throwable -> 
            Error ->...
            Exception ->
                RunttimeException->
                    ArrayIndexOfBoundException
                    NullPointerException
                    ...
                IOException -> 
                    FileNotFoundException

 
*/
public class Test3_JavaIO {
    public static void main(String[] args) throws Exception{
        //This is an abstract representation of a file-path or dir.:
        File f = new File("test10.txt"); 
        FileInputStream fis = new FileInputStream(f);
        System.out.println("File text10.txt exists.");
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);

        File f8 = new File("test8.txt"); 
        //Next throws FileNotFoundException: test8.txt 
        //FileInputStream fis8 = new FileInputStream(f8);
        
        File f9 = new File("test9.txt"); 
        FileInputStream fis9 = new FileInputStream(f9);
        System.out.println("File text9.txt exists.");
        fis9.read();
    }
    
}
