 
package Lesson19;

 
public class Test6 {
    public static void main(String[] args) {
        int [][] array = {{3,7,8}, {4,5}, {9,4,4,6,8,3}};
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int[] array2 : array) {
            for(int a : array2){
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
} 
