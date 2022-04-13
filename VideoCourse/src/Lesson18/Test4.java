 
package Lesson18;

class Car{
} 

public class Test4 {
    
    static String s;
    
    //EXCEPTIONS
    public static void main(String[] args) {
        
     //ArrayIndexOutObBoundsException
     int[] array1 =  {1,2,3};
     array1[4]=12; //Causes ArrayIndexOutOfBoundsException
        
     //NullPointerException   
     int [][] array2 = new int[3][];
     System.out.println(array2[0][1]); //Causes NullPointerException
     
        System.out.println(s.length()); //Causes NullPointerException
    }
    
    
}
