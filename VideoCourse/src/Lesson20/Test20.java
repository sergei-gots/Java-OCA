package Lesson20;

import java.util.Arrays;

public class Test20 {
    
    public static void main(String[] args) {
        int [] array1 = { 1, 2, 3, 4, 5 };
        int [] array2 = { 1, 2, 3, 5 };
        int [] array22 = { 1, 2, 3, 5 };
        char [] arrayCh1 = { 'p', 'r', 'i', 'v', 'e', 't' };
        char [] arrayCh11 = { 'p', 'r', 'i', 'v', 'e', 't', 'o' };
        char [] arrayCh2 = { 'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a' };
        char [] arrayCh22 = { 'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a', '1' };
        
        //Arrays.compare()-method
        System.out.println("Arrays.compare(array1, array2): " 
                           + Arrays.compare(array1, array2 ));
        System.out.println("Arrays.compare(array2, array1): " 
                           + Arrays.compare(array2, array1 ));
        System.out.println("Arrays.compare(array2, array22): " 
                           + Arrays.compare(array2, array22 ));
        System.out.println("Arrays.compare(arrayCh1, arrayCh2): " 
                           + Arrays.compare(arrayCh1, arrayCh2 ));
                System.out.println("Arrays.compare(arrayCh1, arrayCh22): " 
                           + Arrays.compare(arrayCh1, arrayCh22 ));
        System.out.println("Arrays.compare(arrayCh2, arrayCh1): " 
                           + Arrays.compare(arrayCh2, arrayCh1 ));
        System.out.println("Arrays.compare(arrayCh1, arrayCh11): " 
                           + Arrays.compare(arrayCh1, arrayCh11 ));

        char [] arrayChNull1 = null;
        char [] arrayChNull2 = null;
        
        System.out.println("Arrays.compare(arrayCh1, arrayChNull1): " 
                           + Arrays.compare(arrayCh1, arrayChNull1));
        System.out.println("Arrays.compare(arrayChNull1, arrayChNull2): " 
                           + Arrays.compare(arrayChNull1, arrayChNull2 ));

        
        //Arrays.mismatch()-method
        System.out.println("Arrays.mismatch(array1, array2): " 
                           + Arrays.mismatch(array1, array2));
        System.out.println("Arrays.mismatch(arrayCh1, arrayCh2): " 
                           + Arrays.mismatch(arrayCh1, arrayCh2));
        System.out.println("Arrays.mismatch(arrayCh2, arrayCh22): " 
                           + Arrays.mismatch(arrayCh2, arrayCh22));
        System.out.println("Arrays.mismatch(arrayCh2, arrayChNull2): " 
                           + Arrays.mismatch(arrayCh2, arrayChNull2));

    }
    
}
