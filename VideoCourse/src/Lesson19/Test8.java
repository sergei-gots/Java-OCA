 
package Lesson19;
 

public class Test8 {
    public static void main(String[] args) {
        int []array = new int[4];
        for(int i=0; i<array.length; i++){
            array[i]=i*10;
        }
        for(int a:array) {
            System.out.print(a + " ");
        }
        System.out.println();
    
        //Here only the variable 'b' changes its value
        //but we can't assign within foreach-loop
        //values to array items/
        for(int b:array) {
            b=10;
        }
        
        for(int a:array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
