 
package Lesson18;

 
public class Test2 {
    public static void main(String[] args) {
    //ARRAY CREATION STAGES    
        //1. DECLARATION
        String[] array1;
        int[][] array2;
                                //all these variables are refering to null
        
        //2. ALLOCATION
        array1 = new String[3];
        
        array2 = new int[3][];
        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];
                                //now they are pointing to the allocated arrays
                           
        //3. INITIALISATION
        //b) Dynamic initialisation
        for(int i=0; i<array1.length; i++){
            array1[i] = "privet " + i;
            System.out.println(array1[i]);
        }
        
        ROWS:
        for(int i=0; i<array2.length; i++){
        
            COLUMNS:
            for(int j=0; j<array2[i].length; j++){
                array2[i][j]=i+j;
                System.out.println(array2[i][j]);
            }
        }
              
    }   
}
