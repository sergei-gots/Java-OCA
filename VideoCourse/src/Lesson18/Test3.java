 
package Lesson18;

 
public class Test3 {
    public static void main(String[] args) {
        
    //ARRAY CREATION STAGES    
        //MIXED DECLARATION and ALLOCATION
        int[]array1 = new int[7];
        
        //MIXED DECLARATION, ALLOCATION AND INITIALISATION
        int[]array2 = {1,2,3};
        int[] array3=new int[] {1,2,3};
        
        //DECLARATION AND MISSED ALLOCATION AND INITIALISATION
        int[]array4;
        array4 = new int[]{1,2,3};
        
        
     // SQUARS POSITION
     
     int array01[];
     int [] array10;
     int [][] array20;
     int []   array11 [];
     int array02 [][];
     int [][][] array300;
     int [] array102 [][];
     int [][] array201 [];
     int array003 [][][];
//     int c[], []d;
     int c[], d[];
     //int c1[], []d1[];
     int c1[], d1[][];
     //int []c2, [][]d2;
     int c2[][], d2[][];
     int c3, d3[], e3[][], f3[][][][];
     //e3[0][0][0]=1;
     e3=new int[2][];
     int []c5, d5; //BOTH C5 and D5 are ARRAYS!!! BE CAREFUL It's a bad idea, but you should know
     d5=new int[1];
     int []c6, d6[][]; //c6 is 1D, d6 is 3D!!!!!!!!
     d6=new int[2][][];
     
        
    }   
}
