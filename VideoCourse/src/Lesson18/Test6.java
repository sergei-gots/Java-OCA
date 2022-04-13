 
package Lesson18;

 
public class Test6 {
    public static void main(String[] args) {
        int array1[]={1, 9, 3, -8, 0, 5, 4, 1};
        int array2[]={1, 9, 3, -8, 0, 5, 4, 1};
        int array3[]=array2;
        //REFS have being compared ==> false.
        System.out.println("array1==array2:" + (array1==array2));
        //EQUALS-method for arrays is not overloaded:
        System.out.println("array1.equals(array2):" + array1.equals(array2));
        System.out.println("array3.equals(array2):" + array3.equals(array2));
        
        array1[1]=1;
        array1[5-3]=2;
        array1[array1.length-1]=3;
        
        int []array = new int[]{};
    }
  
}
