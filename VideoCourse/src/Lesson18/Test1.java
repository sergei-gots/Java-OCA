 
package Lesson18;

 
public class Test1 {
    public static void main(String[] args) {
    //ARRAY CREATION STAGES    
        //1. DECLARATION
        int[] array1; 
        String[] array2;
        double[][] array3;
        double [] array5;
        double [] array7;
        
        int[][] array10;
                                //all these variables are refering to null
        
        //2. ALLOCATION
        array1 = new int[8];
        array2 = new String[3]; 
        array3 = new double[4][2];
        array5 = new double[2];
        array7 = new double[2];
        array10 = new int[3][];
                                //now they are pointing to the allocated arrays
                           
        //field .lenght is an attribut of array                            
        System.out.println("array2.length:"+array2.length);                       
                                
        //3. INITIALISATION
        //a) Static initialisation
        array2[0]="privet";
        array2[1]="poka";
        array2[2]="ok";
        
        array5[0]=2.5;
        array5[1]=3.5;
        
        array7 = array5;
        System.out.println("array7[1]:"+array7[1]);
        
        
        array3[0][0]=3.14;
        array3[2][1]=3.14;
        
        array3[1] = array5; //array3[0].length = array5.length
        System.out.println(array3[1][0]);
        
    }   
}
