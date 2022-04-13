 
package Lesson18;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        
        int array1[] = {1,9,3,-8,0,5,4,1};
        int array2[] = {1,9,3,-8,0,5,4,1};
        
//METHOD Arrays.sort(Object)        
        for (int i=0; i<array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        Arrays.sort(array1);
                for (int i=0; i<array1.length; i++){
            System.out.print(array1[i] + " ");
        }
                
//METHOD Arrays.binarySearch(Object[] args, value);                
        System.out.println("");
        int index = Arrays.binarySearch(array1,  -8);
        System.out.println(index);
        //if there is no finding value, it returns -(INDEX+1) of max value
        //in the array which is less than finding value IF ARRAY IS SORTED
        //otherwise the return index value is unpredictable
        index = Arrays.binarySearch(array1,  2);
        System.out.println(index);
        index = Arrays.binarySearch(array1,  12);
        System.out.println(index);
        index = Arrays.binarySearch(array2,  2);
        System.out.println(index);

    }
}
